package BusinessLogicLayer;

import java.util.*;

public class WeddingEvent extends EventType{
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
        String eventID = new StringBuilder().append("ba" + char1 + char2 + random_int1 + random_int2 + random_int3).toString();
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
        eventRate = 1000.00;
        adultRate = 0.00;
        childRate = 0.00;
        int counter = 0;

        Menu menu = new Menu();

        Random random = new Random();

        char char1 = (char) ('a' + random.nextInt(26));
        char char2 = (char) ('a' + random.nextInt(26));

        int random_int1 = random.nextInt(9);
        int random_int2 = random.nextInt(9);
        int random_int3 = random.nextInt(9);

       //Getting input and setting values
        String eventID = new StringBuilder().append("me" + char1 + char2 + random_int1 + random_int2 + random_int3).toString();
        menu.setMenuID(eventID);

        System.out.println("Do you want an Adult Menu True/False?");
        menu.setAdult(sc.nextBoolean());
        if (sc.nextBoolean() == true) {
            counter++;
        }

        System.out.println("Do you want an Kids Menu True/False?");
        menu.setKids(sc.nextBoolean());
        if (sc.nextBoolean() == true) {
            counter++;
        }

        System.out.println("Do you want an Warm Drinks Menu True/False?");
        menu.setWarmsDrinks(sc.nextBoolean());
        if (sc.nextBoolean() == true) {
            counter++;
        }

        System.out.println("Do you want an Cold Drinks Menu? True/False");
        menu.setColdDrinks(sc.nextBoolean());
        if (sc.nextBoolean() == true) {
            counter++;
        }

        System.out.println("Do you want an Desert Menu? True/False");
        menu.setDesert(sc.nextBoolean());
        if (sc.nextBoolean() == true) {
            counter++;
        }

        switch (counter) {
            case 1:
                adultRate = 80.00;
                childRate = 40.00;
                break;
            case 2:
                adultRate = 90.00;
                childRate = 50.00;
                break;
            case 3:
                adultRate = 100.00;
                childRate = 60.00;
                break;
            case 4:
                adultRate = 110.00;
                childRate = 70.00;
                break;
            case 5:
                adultRate = 120.00;
                childRate = 80.00;
                break;
        
            default:
                adultRate = 80.00;
                childRate = 40.00;
                break;
        }

        double totalCost = eventRate + (adultNum * adultRate) + (childNum * childRate);
        
        if (confirmedEarly == true) {
            totalCost = totalCost * 0.50;
        }
        if (adultNum + childNum > 40) {
            totalCost = totalCost * 0.15;
        }

        Event event = new Event();
        event.setTotalCost(totalCost);
        
    }
}