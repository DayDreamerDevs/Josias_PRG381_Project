package PresentationLayer;

import java.io.IOException;
import java.util.*;

import BusinessLogicLayer.User;
import DataAccessLayer.DataHandler;

public class Login {
    public void loginScreen() throws IOException{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your Username");
        String username = sc.nextLine();

        System.out.println("Enter your Password");
        String password = sc.nextLine();

        boolean isOwner = false;
        List<User> userList = new ArrayList<User>();
        DataHandler dataHandler = new DataHandler();

        userList = dataHandler.readText(0);

        List usernameList = userList.subList(1, 1);
        List passwordList = userList.subList(2, 2);
        boolean validLogin = false;

        while (validLogin == false) {
            if (username == userList.toString() && password == passwordList.toString()) {
                validLogin = true;
                if (username == "Raheal " && password == "RahealPass121") {
                    isOwner = true;
                }
                if (isOwner == true) {
                    OwnerMenu ownerMenu = new OwnerMenu();
                    ownerMenu.ownerMenuScreen();
                }else{
                    Menu menu = new Menu();
                    menu.menuScreen();
                }
            } else{
                System.out.println("Please enter a Valid Username or Password");
            } 
        }

    }
}
