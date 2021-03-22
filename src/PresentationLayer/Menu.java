package PresentationLayer;

import java.util.*;

import BusinessLogicLayer.EventSelection;
import BusinessLogicLayer.EventType;

public class Menu {
    public void menuScreen(){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Create an Event");
        System.out.println("2. Exit Program");

        int menuSelect = sc.nextInt();
        EventSelection eventSelection = new EventSelection();

        switch (menuSelect) {
            case 1:
                System.out.println("What type of Event do you want to Host?");
                System.out.println("Baptism, Wedding, EndYearFunction, Birthday?");

                String eventOfType = sc.nextLine().toLowerCase();
                int index = 1;

                switch (eventOfType) {
                    case "baptism":
                        index = 1;
                        break;
                    case "wedding":
                        index = 2;
                        break;
                    case "endyearfunction":
                        index = 3;
                        break;
                    case "birthday":
                        index = 4;
                        break;
                    default:
                        System.out.printf("%s \n is not a Valid Option. Please enter a Valid Option", eventOfType);
                        break;
                }
                EventType eventType = eventSelection.getEvent(index);
                eventType.getEventDetails();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.printf("%s \n is not a Valid Option. Please enter a Valid Option", menuSelect);
                break;
        }
    }
}
