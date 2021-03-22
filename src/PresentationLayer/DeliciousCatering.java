package PresentationLayer;

import BusinessLogicLayer.EventSelection;
import BusinessLogicLayer.EventType;

public class DeliciousCatering {
    public static void main(String[] args) throws Exception {
        EventSelection eventSelection = new EventSelection();
        EventType eventType = eventSelection.getEvent(1);
    }
}
