package com.example.android.quakereport;
import java.text.SimpleDateFormat;
import java.util.Date;

public class earthquake {
    private String magnitude;
    private String location;
    private long date;
    private long time;

    public earthquake(String num,String location, long date){
        this.magnitude = num;
        this.location= location;
        this.date= date;

    }

    public String getMagnitude(){
        return magnitude;
    }

    public String getLocation(){
        return location;
    }

    public long getDate(){ return date; }

    public int getTime() {return (int)time;}

    public void setMagnitude(String mag){ magnitude = mag; }

    public void setDate(long date) { this.date = date; }

    public void setLocation(String location) { this.location = location; }

    public void setTime(long time){ this.time= time;}

    Date dateObject = new Date(time);
}
