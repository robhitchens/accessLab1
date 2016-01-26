package io.zipcoder.tests;
import io.zipcoder.ConnectionManager;
import io.zipcoder.Connection;
/**
 * Created by roberthitchens3 on 1/22/16.
 */
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class ConnectionManagerSpec {
    ConnectionManager conMan = new ConnectionManager();
    @Test
    public void connectionAddTest(){
        Connection con = new Connection();
        con.setPorNumber(2869);
        con.setIpAddress("192.168.1.255");
        conMan.addConObj(con);
        ArrayList<Connection> returnedList = conMan.getConList();
        assertFalse("the arrayList should not be empty: ", returnedList.isEmpty());
    }
    @Test
    public void connectionRemoveTest(){
        Connection con = new Connection();
        con.setPorNumber(2869);
        con.setIpAddress("192.168.1.1");
        conMan.addConObj(con);
        assertNotNull("object returned should not be null", conMan.removeConObj(con));
    }
    @Test
    public void connectionRemoveNullReturnedTest(){
        Connection con = new Connection();
        con.setIpAddress("192.168.1.1");
        con.setPorNumber(2869);
        //conMan.addConObj(con);
        assertNull("method should return null", conMan.removeConObj(con));
    }
}
