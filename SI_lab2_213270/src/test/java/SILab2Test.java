import org.example.SILab2;
import org.example.User;
import org.junit.jupiter.api.*;

import java.util.*;

public class SILab2Test {
    public SILab2 klasa = new SILab2();
    User uuu = new User("viks2", "dame123", "viktor@viks.com");

    public ArrayList<User> lista = new ArrayList<>();

    @Test
    void userTest() {
        //everything unique
        lista.add(new User("viks1", "vvv1", "vvv@gmail.com"));
        Assertions.assertEquals(false, klasa.function(uuu, lista));

        //password<8, nulluser
        User hel = new User(null, "5555", "viks@aaa.com");
        Assertions.assertFalse(klasa.function(hel, lista));

        //password with empty space
        User vvv = new User("bbo", "1234 555555", "finki.ukim@gmail.com");
        Assertions.assertFalse(klasa.function(vvv, lista));

        //duplicate from list
        lista.add(new User("viks2", "ffff", "viktor@viks.com"));
        User dup = new User("viks2", "github","viktor@viks.com");
        Assertions.assertEquals(false, klasa.function(dup, lista));

        //password with special character, expected true
        User vikss = new User("viks", "123456$$33", "vvv@vvv.com");
        Assertions.assertTrue(klasa.function(vikss, lista));

        //email without @
        User no = new User("lol", "123123123123", "nomonkey");
        Assertions.assertFalse(klasa.function(no, lista));
    }
    @Test
    void nullTest() {
        //null
        User nullo = new User(null, null, "hello@t.com");
        Assertions.assertThrows(RuntimeException.class, () -> klasa.function(nullo, lista));

        //no exception test
        Assertions.assertDoesNotThrow(() ->{
            klasa.function(uuu, lista);
        });
    }
}