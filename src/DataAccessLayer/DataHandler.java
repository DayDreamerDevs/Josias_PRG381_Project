package DataAccessLayer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import BusinessLogicLayer.Event;
import BusinessLogicLayer.Menu;
import BusinessLogicLayer.User;

public class DataHandler {
    public String sourceFile = null;
    public String sourceLine = null;

    public List readText(int index) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(new File(sourceFile)));
        List<User> clientList = new ArrayList<User>();
        List<Event> eventList = new ArrayList<Event>();
        List<Menu> menuList = new ArrayList<Menu>();

        switch (index) {
            case 0:
                sourceFile = "client.txt";
                reader = new BufferedReader(new FileReader(new File(sourceFile)));
                while ((sourceLine = reader.readLine()) != null) {
                    clientList.add(new User(sourceLine));
                }
                reader.close();
                return clientList;
            case 1:
                sourceFile = "event.txt";
                reader = new BufferedReader(new FileReader(new File(sourceFile)));
                while ((sourceLine = reader.readLine()) != null) {
                    eventList.add(new Event(sourceLine));
                }
                reader.close();
                return eventList;
            case 2:
                sourceFile = "menu.txt";
                reader = new BufferedReader(new FileReader(new File(sourceFile)));
                while ((sourceLine = reader.readLine()) != null) {
                    menuList.add(new Menu(sourceLine));
                }
                reader.close();
                return menuList;
            default:
                reader.close();
                break;
            }
            return eventList;
        }
    
    public void writeText(int index, String writeString) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File(sourceFile)));

        switch (index) {
            case 0:
                sourceFile = "client.txt";
                writer.write(writeString);
                break;
            case 1:
                sourceFile = "event.txt";
                writer.write(writeString);
                break;
            case 2:
                sourceFile = "owner.txt";
                writer.write(writeString);
                break;
            default:
                break;
        }
    }
}
