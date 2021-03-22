package BusinessLogicLayer;

import java.util.List;

public class Menu {
    private String menuID;
    private boolean adult;
    private boolean kids;
    private boolean warmsDrinks;
    private boolean coldDrinks;
    private boolean desert;
    
    public String getMenuID() {
        return menuID;
    }
    public void setMenuID(String menuID) {
        this.menuID = menuID;
    }
    public boolean isAdult() {
        return adult;
    }
    public void setAdult(boolean adult) {
        this.adult = adult;
    }
    public boolean isKids() {
        return kids;
    }
    public void setKids(boolean kids) {
        this.kids = kids;
    }
    public boolean isWarmsDrinks() {
        return warmsDrinks;
    }
    public void setWarmsDrinks(boolean warmsDrinks) {
        this.warmsDrinks = warmsDrinks;
    }
    public boolean isColdDrinks() {
        return coldDrinks;
    }
    public void setColdDrinks(boolean coldDrinks) {
        this.coldDrinks = coldDrinks;
    }
    public boolean isDesert() {
        return desert;
    }
    public void setDesert(boolean desert) {
        this.desert = desert;
    }
    public Menu() {
    }
    public Menu(String menuID, boolean adult, boolean kids, boolean warmsDrinks, boolean coldDrinks, boolean desert) {
        this.menuID = menuID;
        this.adult = adult;
        this.kids = kids;
        this.warmsDrinks = warmsDrinks;
        this.coldDrinks = coldDrinks;
        this.desert = desert;
    }
    public Menu(String sourceLine) {
    }

    public List<Menu> getMenu(){
        List<Menu> menu = (List<Menu>) new Menu();
        return menu;
    }
}
