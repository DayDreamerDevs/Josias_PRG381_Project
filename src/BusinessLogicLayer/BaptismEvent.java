package BusinessLogicLayer;

import java.util.*;

public class BaptismEvent extends EventType{
    Scanner sc = new Scanner(System.in);

    @Override
    public void getEventDetails() {
        //generate eventID
        //eventType and ClientID must be given too method
        Event event = new Event();

        System.out.println("What is the Event Date and Time of the Event?");
        event.setDateTime(sc.nextLine());
        
        System.out.println("What is the Address of the Event Venue?");
        event.setAddress(sc.nextLine());
        
        System.out.println("What is the Total Number of people coming to the Event?");
        event.setTotalPeople(sc.nextInt());

        System.out.println("What is the Number od Adults coming to the Event?");
        event.setAdultNum(sc.nextInt());

        System.out.println("What is the Number of Children coming to the Event?");
        event.setChildNum(sc.nextInt());

        System.out.println("True or False is Decorations needed?");
        event.setDecorationAns(sc.nextBoolean());

        System.out.println("What is the Theme or Description of the decorations?");
        event.setDateTime(sc.nextLine());

        System.out.println("True or False is the event confirmed?");
        event.setConfirmedAns(sc.nextBoolean());

        System.out.println("What is the Confirmed Date and Time of the Event?");
        event.setConfirmedDateTime(sc.nextLine());

        /*Owner owner = new Owner();
        owner.setAge(30);*/
    }

    @Override
    public void eventTotal(int adultNum, int childNum, boolean confirmedEarly) {
        
    }
    
}