package PresentationLayer;

import java.util.*;

public class Menu {
    public void menuScreen(){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Create an Event");
        System.out.println("2. Change an Event Menu");
        System.out.println("3. Confirm an Event");
        System.out.println("4. Exit Program");

        int menuSelect = sc.nextInt();
    }
}
