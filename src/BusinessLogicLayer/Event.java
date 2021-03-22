package BusinessLogicLayer;

import java.sql.Date;

public class Event {
    private String eventID;
    private String clientID;
    private String menuID;
    private int type;
    private Date dateTime;
    private String address;
    private int totalPeople;
    private int adultNum;
    private int childNum;
    private boolean decorationAns;
    private String decorationDesc;
    private double totalCost;
    private boolean confirmedAns;
    private Date confirmedDateTime;
    
    public String getEventID() {
        return eventID;
    }
    public void setEventID(String eventID) {
        this.eventID = eventID;
    }
    public String getClientID() {
        return clientID;
    }
    public void setClientID(String clientID) {
        this.clientID = clientID;
    }
    public String getMenuID() {
        return menuID;
    }
    public void setMenuID(String menuID) {
        this.menuID = menuID;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public Date getDateTime() {
        return dateTime;
    }
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getTotalPeople() {
        return totalPeople;
    }
    public void setTotalPeople(int totalPeople) {
        this.totalPeople = totalPeople;
    }
    public int getAdultNum() {
        return adultNum;
    }
    public void setAdultNum(int adultNum) {
        this.adultNum = adultNum;
    }
    public int getChildNum() {
        return childNum;
    }
    public void setChildNum(int childNum) {
        this.childNum = childNum;
    }
    public boolean isDecorationAns() {
        return decorationAns;
    }
    public void setDecorationAns(boolean decorationAns) {
        this.decorationAns = decorationAns;
    }
    public String getDecorationDesc() {
        return decorationDesc;
    }
    public void setDecorationDesc(String decorationDesc) {
        this.decorationDesc = decorationDesc;
    }
    public double getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    public boolean isConfirmedAns() {
        return confirmedAns;
    }
    public void setConfirmedAns(boolean confirmedAns) {
        this.confirmedAns = confirmedAns;
    }
    public Date getConfirmedDateTime() {
        return confirmedDateTime;
    }
    public void setConfirmedDateTime(Date confirmedDateTime) {
        this.confirmedDateTime = confirmedDateTime;
    }

    public Event() {

    }
    
    public Event(String eventID, String clientID, String menuID, int type, Date dateTime, String address,
            int totalPeople, int adultNum, int childNum, boolean decorationAns, String decorationDesc, double totalCost,
            boolean confirmedAns, Date confirmedDateTime) {
        this.eventID = eventID;
        this.clientID = clientID;
        this.menuID = menuID;
        this.type = type;
        this.dateTime = dateTime;
        this.address = address;
        this.totalPeople = totalPeople;
        this.adultNum = adultNum;
        this.childNum = childNum;
        this.decorationAns = decorationAns;
        this.decorationDesc = decorationDesc;
        this.totalCost = totalCost;
        this.confirmedAns = confirmedAns;
        this.confirmedDateTime = confirmedDateTime;
    }
}
