package io.zipcoder;
import java.util.ArrayList;
/**
 * Created by roberthitchens3 on 1/22/16.
 */
public class ConnectionManager {

    public static void main(String[] args){
        ConnectionManager conTest = new ConnectionManager();
        Connection conObj = new Connection();
        conObj.setIpAddress("192.168.2.0");
        conObj.setPorNumber(2869);
        Connection conObj2 = new Connection();
        conObj2.setIpAddress("192.168.2.1");
        conObj2.setPorNumber(2869);
        Connection conObj3 = new Connection();
        conObj3.setIpAddress("192.168.2.201");
        conObj3.setPorNumber(2869);
        conTest.addConObj(conObj);
        conTest.addConObj(conObj2);
        conTest.addConObj(conObj3);
        for(Connection x: conTest.getConList()){
            conTest.displayConObj(x);
        }
        System.out.println("remove test: ");
        conTest.removeConObj(conObj2);
        for(Connection y: conTest.getConList()){
            conTest.displayConObj(y);
        }
    }
    private static ArrayList<Connection> conArr;
    public ConnectionManager(){
        conArr = new ArrayList<Connection>();
    }

    public static void addConObj(Connection con){
        conArr.add(con);
    }

    public static Connection removeConObj(Connection conObj){
        Connection removed = null;
        if(conArr.remove(conObj)){
            removed = conObj;
        }
        return removed;
    }
    public static void displayConObj(Connection conObj){
        System.out.println("Port Number: " + conObj.getPortNumber());
        System.out.println("IP Address: "+ conObj.getIpAddress());
    }
    public static ArrayList<Connection> getConList(){
        return conArr;
    }
}
