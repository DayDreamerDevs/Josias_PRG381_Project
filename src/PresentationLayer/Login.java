package PresentationLayer;

import java.util.*;

public class Login {
    public void loginScreen(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your Username");
        String username = sc.nextLine();

        System.out.println("Enter your Password");
        String password = sc.nextLine();

        boolean isOwner = false;
        if (isOwner == false) {
            Menu menu = new Menu();
            menu.menuScreen();
        }else{
            OwnerMenu ownerMenu = new OwnerMenu();
            ownerMenu.ownerMenuScreen();
        }
        
    }
}
