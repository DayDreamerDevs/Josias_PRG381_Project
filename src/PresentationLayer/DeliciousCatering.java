package PresentationLayer;

import BusinessLogicLayer.EventSelection;
import BusinessLogicLayer.EventType;

public class DeliciousCatering {
    public static void main(String[] args) throws Exception {
        Register register = new Register();
        register.registerScreen();
        
        EventSelection eventSelection = new EventSelection();
        EventType eventType = eventSelection.getEvent(1);

        int adultNum = 2, childNum= 2;
        boolean confirmedEarly = true;

        eventType.getEventDetails();
        eventType.eventTotal(adultNum, childNum, confirmedEarly);
    }
}
