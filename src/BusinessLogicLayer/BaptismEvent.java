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
        
        /*Owner owner = new Owner();
        owner.setAge(30);*/
    }

    @Override
    public void eventTotal(int adultNum, int childNum, boolean confirmedEarly) {
        
    }
    
}