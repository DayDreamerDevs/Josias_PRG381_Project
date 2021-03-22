package PresentationLayer;

import java.io.IOException;
import java.util.*;

import BusinessLogicLayer.Event;
import BusinessLogicLayer.User;
import DataAccessLayer.DataHandler;

public class OwnerMenu {
    public void ownerMenuScreen() throws IOException{
        Scanner sc = new Scanner(System.in);

        System.out.println("1. View Events");
        System.out.println("2. View Clients");
        System.out.println("3. Exit Program");

        int menuSelect = sc.nextInt();
        DataHandler dataHandler = new DataHandler();

        switch (menuSelect) {
            case 1:
                List<Event> eventlist = new ArrayList<Event>();
                eventlist = dataHandler.readText(1);
                System.out.println(eventlist);
                break;
            case 2:
                List<User> userlist = new ArrayList<User>();
                userlist = dataHandler.readText(0);
                System.out.println(userlist);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.printf("%s \n is not a Valid Option. Please enter a valid Option", menuSelect);
                break;
        }
    }
}
