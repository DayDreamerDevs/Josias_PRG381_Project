package BusinessLogicLayer;

import java.util.*;
public class BirthdayEvent extends EventType{
    Scanner sc = new Scanner(System.in);

    @Override
    public void getEventDetails() {
        Event event = new Event();
        //EventID generation
        Random random = new Random();

        char char1 = (char) ('a' + random.nextInt(26));
        char char2 = (char) ('a' + random.nextInt(26));

        int random_int1 = random.nextInt(9);
        int random_int2 = random.nextInt(9);
        int random_int3 = random.nextInt(9);

       //Getting input and setting values
        String eventID = new StringBuilder().append("bi" + char1 + char2 + random_int1 + random_int2 + random_int3).toString();
        event.setEventID(eventID);

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
    }

    @Override
    public void eventTotal(int adultNum, int childNum, boolean confirmedEarly) {
        //add Menu Selection
        
    }
}
