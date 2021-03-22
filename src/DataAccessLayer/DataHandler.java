package DataAccessLayer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataHandler {
    public String sourceFile = null;
    public String sourceLine = null;

    public List<String> readText(int index) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(new File(sourceFile)));
        List<String> clientList = new ArrayList<String>();
        List<String> eventList = new ArrayList<String>();
        List<String> ownerList = new ArrayList<String>();

        switch (index) {
            case 0:
                sourceFile = "client.txt";
                while ((sourceLine = reader.readLine()) != null) {
                    clientList.add(sourceLine);
                }
                reader.close();
                return clientList;
            case 1:
                sourceFile = "event.txt";
                while ((sourceLine = reader.readLine()) != null) {
                    eventList.add(sourceLine);
                }
                reader.close();
                return eventList;
            case 2:
                sourceFile = "owner.txt";
                while ((sourceLine = reader.readLine()) != null) {
                    ownerList.add(sourceLine);
                }
                reader.close();
                return ownerList;
            default:
                sourceFile = "event.txt";
                while ((sourceLine = reader.readLine()) != null) {
                    eventList.add(sourceLine);
                }
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