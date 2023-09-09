/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyTime;

/**
 *
 * @author Pandawan
 */
public class Time {
    private int hour;
    private int minute;
    private int second;
    private boolean meridian;
    
    //Constuctor
    public Time() {
    }

    public Time(int hour, int minute, int second, boolean meridian) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.meridian = meridian;
    }
    
    //Getters and Setters
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public boolean isMeridian() {
        return meridian;
    }

    public void setMeridian(boolean meridian) {    
        this.meridian = meridian;
    }

    public void advanceTime(int seconds) {
        second = second + seconds;
        if (second > 59) {
            minute = minute + second / 60;
            second = second % 60; 
            if (minute > 59) {
                hour = hour + minute / 60;
                minute = minute % 60; 
            }
        }
        
        System.out.println("\nThe time is advanced by " + seconds + "seconds\n");
    }

    public void tickByHour() {
        hour = hour + 1;
        if (hour == 13) {
            hour = 1;
        }
        System.out.println("\nThe time is advanced by one hour.\n");
    }

    public void tickByMinute() {
        minute += 1;
        if (minute == 60) {
            minute = 0;
            hour += 1;
            if (hour == 13) {
                hour = 1;
            }
        }
        System.out.println("\nThe time is advanced by one minute.\n");
    }

    public void tickBySecond() {
        second += 1;
        if (second == 60) {
            second = 0;
            minute += 1;
            if (minute == 60) {
                minute = 0;
                hour += 1;
                if (hour == 13) {
                    hour = 1;
                }
            }
        }
        System.out.println("\nThe time is advanced by one second.\n");
    }

    public void display12Hour() {
        System.out.println("12-HOUR TIME:");
        String period = meridian ? "AM" : "PM";
        int displayHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        System.out.printf("%02d:%02d:%02d %s\n", displayHour, minute, second, period);
    }

    public void display24Hour() {
        System.out.println("24-HOUR TIME:");
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }

    @Override
    public String toString() {
        return String.format("CURRENT TIME: %02d:%02d:%02d\n", hour, minute, second);
    }
}