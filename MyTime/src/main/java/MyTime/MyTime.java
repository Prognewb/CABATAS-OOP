/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyTime;

/**
 *
 * @author Pandawan
 */
public class MyTime {
    public static void main(String[] args) {
        Time time1 = new Time(12,59,59,false);

        System.out.println(time1);

        time1.advanceTime(15);
        time1.display12Hour();
        time1.display24Hour();
        
        time1.display12Hour();
        time1.tickByHour();
        time1.display12Hour();

        time1.display24Hour();
        time1.tickByMinute();
        time1.display24Hour();

        time1.display24Hour();
        time1.tickBySecond();
        time1.display24Hour();
    }
}