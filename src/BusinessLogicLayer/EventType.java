package BusinessLogicLayer;

public abstract class EventType {
    protected double eventRate;
    protected double adultRate;
    protected double childRate;
    
    public abstract void getEventDetails();

    public abstract void eventTotal(int adultNum, int childNum, boolean confirmedEarly);
}