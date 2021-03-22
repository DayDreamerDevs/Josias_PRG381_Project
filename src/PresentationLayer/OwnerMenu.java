package PresentationLayer;

import java.util.*;

public class OwnerMenu {
    public void ownerMenuScreen(){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. View Events");
        System.out.println("2. View Confirmed Events");
        System.out.println("3. View Unconfirmed Events");
        System.out.println("4. Exit Program");

        int menuSelect = sc.nextInt();
    }
}
