/* Title: Time.java
 * Abstract: This program will create a time class that has 3 constructors, a default, an hours, and an hours and minutes,
 * and if time invalid then set time to 0,have method to get String of time in military time, toStandard(),
 * have method to get String of time in Standard time, toMilitary(), have method to add two time objects together
 * and return a new time object, add()
 * For part C, we will implement the Comparable declaration, and add a toMinutes method which converts all of the times
 * into minutes. The Comparable will sort the times by minutes. It says to add test code, so I added test code to my
 * runner/main class, which is not included.
 * Author: Jacob Bello
 * Email: jbello@csumb.edu
 * Estimate: 3 hours
 * Date: 03/18/2024
 */

public class Time implements Comparable<Time>{

    private int hours;
    private int minutes;

    public Time() {
        hours = 0;
        minutes = 0;
    }

    public Time(int hours){
        this.hours = hours;
        minutes = 0;
    }

    public Time(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }

    public String toStandard(){
        int standardHours = hours;
        int standardMinutes = minutes;
        String amOrPm;



        if (hours > 24 || minutes >= 60 || hours == 0 && minutes == 0) {
            standardHours = 12;
            standardMinutes = 0;
            amOrPm = "AM";
            return String.format("%02d",standardHours) + ":" + String.format("%02d",standardMinutes) + amOrPm;        }



        if (hours >= 12){
            if (hours > 12){
            standardHours -= 12;}
            amOrPm = "PM";
            return String.format("%02d",standardHours) + ":" + String.format("%02d",standardMinutes) + amOrPm;
        }
        else {
            amOrPm = "AM";
            return String.format("%2d",standardHours) + ":" + String.format("%02d",standardMinutes) + amOrPm;
        }


    }

    public int differenceInMinutes(Time other) {
        int thisMinutes = this.toMinutes();
        int otherMinutes = other.toMinutes();
        return Math.abs(thisMinutes - otherMinutes);
    }
    public String toMilitary(){
        int militaryHours = hours;
        int militaryMinutes = minutes;

        if (militaryHours > 24 || militaryMinutes >= 60){
            militaryHours = 0;
            militaryMinutes = 0;
        }

        return String.format("%02d", militaryHours) + String.format("%02d", militaryMinutes);
    }

    public String toString(){
        return toMilitary();
    }

    public Time add(Time t2){
        // add this time plus the time object that was passed in
        int hoursSum = this.hours + t2.hours;
        int minutesSum = this.minutes + t2.minutes;

        if (minutesSum >= 60){
            minutesSum = minutesSum % 60;
            hoursSum += 1;
        }
        if (hoursSum > 24){
            hoursSum = hoursSum % 24;
        }


        return new Time(hoursSum,minutesSum);
    }

    // PART C
    public int toMinutes(){
        int value = (hours * 60) + minutes;
        return value;
    }

    @Override
    public int compareTo(Time t) {
        if (this.toMinutes() == t.toMinutes()){
            return 0;
        } else if (this.toMinutes() > t.toMinutes()) {
            return 1;
        } else return -1;
    }
}
