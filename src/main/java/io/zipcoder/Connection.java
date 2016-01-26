package io.zipcoder;

/**
 * Created by roberthitchens3 on 1/22/16.
 */
public class Connection {
    private int portNumber;
    private String ipAddress;

    public void setPorNumber(int num){
        portNumber = num;
    }
    public void setIpAddress(String ipAdd){
        ipAddress = ipAdd;
    }
    public int getPortNumber(){return portNumber;}
    public String getIpAddress(){return ipAddress;}
}
