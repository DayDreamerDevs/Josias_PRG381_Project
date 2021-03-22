package BusinessLogicLayer;

public class EventSelection {
    EventType eventType;
    public EventType getEvent(int typeOfEvent){
        
        switch (typeOfEvent) {
            case 1:
                eventType = new BaptismEvent();
                break;
            case 2:
                eventType = new WeddingEvent();
                break;
            case 3:
                eventType = new YearEndFunction();
                break;
            case 4:
                eventType = new BirthdayEvent();
                break;
        
            default:
                System.out.printf("%s \n Is not a Valid. Please select a valid Option", typeOfEvent);
                break;
        }
        return eventType;
    }
}
