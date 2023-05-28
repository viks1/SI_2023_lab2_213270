package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SILab2 {

    public static boolean function (User user, List<User> allUsers) {
        if (user==null || user.getPassword()==null || user.getEmail()==null){ //1
            throw new RuntimeException("Mandatory information missing!"); //2
        }

        if (user.getUsername()==null){ //3
            user.setUsername(user.getEmail()); //4

        }

        int same = 1; //5
        if (user.getEmail().contains("@") && user.getEmail().contains(".")) { //6
            same = 0; //7
            for (int i=0;i<allUsers.size();i++) { //8.1; 8.2; 8.3
                User existingUser = allUsers.get(i); //9
                if (existingUser.getEmail() == user.getEmail()) { //10
                    same += 1; //11
                }
                if (existingUser.getUsername() == user.getUsername()) {  //12
                    same += 1; //13
                }
            }
        }

        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";  //14
        String password = user.getPassword(); //15
        String passwordLower = password.toLowerCase(); //16

        if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length()<8) { //17
            return false; //18
        }
        else {
            if (!passwordLower.contains(" ")) { //19
                for (int i = 0; i < specialCharacters.length(); i++) { //20.1; 20.2; 20.3
                    if (password.contains(String.valueOf(specialCharacters.charAt(i)))) { //21
                        return same == 0;  //22
                    }
                }
            }
        }
        return false; //23
    }
    //24??
}
