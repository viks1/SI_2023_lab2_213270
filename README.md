# Viktor Atanasoski 213270

# Control Flow Graph (2)
![1](https://github.com/viks1/SI_2023_lab2_213270/assets/20116149/e78a8532-47f2-49a6-9f0d-84b0301f6d98)
# Cyclomatic complexity (3)
![2](https://github.com/viks1/SI_2023_lab2_213270/assets/20116149/77deaf54-7b8a-43f2-b8d3-47646c52c4ce)

**Вкупно имаме комплексност од 11**

# Every Branch (4)
![3](https://github.com/viks1/SI_2023_lab2_213270/assets/20116149/be172241-7116-4ef0-9879-2b44f7441bdc)
![4](https://github.com/viks1/SI_2023_lab2_213270/assets/20116149/1d5b4004-ba50-4d3c-9d0e-25a1b9d12228)

**test case 1: username/email unique, pasw>8 no special char; (red)**

**test case 2: null username, pasw<8; (blue)**

**test case 3: no @, pasw special; (purple/pink)**

**test case 4: " " in pasw, duplicate user; (orange)**

**test case 5: everything null (gray)**

# Multiple Condition (5)
![5](https://github.com/viks1/SI_2023_lab2_213270/assets/20116149/2a83671a-9f38-4f8c-9ad9-6b93aff1d8b4)

**test case 1: user=null (првиот услов е исполнет)**

**test case 2: user.getPassword()=null (првиот услов не е исполнет, вториот е исполнет)**

**test case 3: user.getEmail()=null (првите два услова не се исполнети, третиот е исполнет)**

**test case 4: user!=null && user.getPassword()=null && user.getEmail()=null** (сите три услова не се исполнуваат)
