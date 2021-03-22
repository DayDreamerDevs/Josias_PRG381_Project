package PresentationLayer;

import java.util.*;

import BusinessLogicLayer.User;

public class Register {
    public void registerScreen(){
        Scanner sc = new Scanner(System.in);

        System.out.println("{-----Welcome to Delicious Catering Service-----}");
        System.out.println("Do you already have an Account?");
        
        int accountYN = sc.nextInt();

        if (accountYN == 1) {
            Login login = new Login();
            login.loginScreen();
        } else {
            User user = new User();
            Random random = new Random();

            char char1 = (char) ('a' + random.nextInt(26));
            char char2 = (char) ('a' + random.nextInt(26));
    
            int random_int1 = random.nextInt(9);
            int random_int2 = random.nextInt(9);
            int random_int3 = random.nextInt(9);
    
           //Getting input and setting values
            String clientID = new StringBuilder().append("bi" + char1 + char2 + random_int1 + random_int2 + random_int3).toString();
            user.setClientID(clientID);

            System.out.println("What is your Username?");
            user.setUsername(sc.nextLine());

            System.out.println("What is your Password?");
            user.setPassword(sc.nextLine());

            System.out.println("What is your First Name?");
            user.setFirstName(sc.nextLine());

            System.out.println("What is your Last Name?");
            user.setLastName(sc.nextLine());

            System.out.println("What is your Age?");
            user.setAge(sc.nextInt());

            while (sc.nextLine().length() != 10) {
                System.out.println("What is your Cell Number?");
                user.setCellNumber(sc.nextLine());
            }

            boolean email = false;
            while (email != true) {
                System.out.println("What is your Email address?");
                user.setEmail(sc.nextLine());

                if  ((sc.nextLine().contains("@")) || (sc.nextLine().contains("."))){
                    email = true;
                }
            }

            while (sc.nextLine().length() != 12) {
                System.out.println("What is your National ID?");
                user.setNationalID(sc.nextLine());
            }
        }
        Login login = new Login();
        login.loginScreen();        
    }
}
