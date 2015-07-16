package com.company.Package1;

/**
 * Created by SpacePunch on 16.07.2015.
 */
public abstract class AbstractMoto {

    public String name;
    public String color;
    public int speed;


    public void setColor(String color) {
        this.color = color;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public void setName(String name) {
        this.name = name;
    }

    public static void race(AbstractMoto moto1, AbstractMoto moto2) {
        int time1 = 0;
        int time2 = 0;
        for (int i = 0; i < 30000/moto1.speed; i++) time1++;
        for (int i = 0; i < 30000/moto2.speed; i++) time2++;
        time1 = time1 / 60;
        time2 = time2 / 60;
        System.out.println("Time of "+moto1.name+" is "+time1+" min");
        System.out.println("Time of "+moto2.name+" is "+time2+" min");
        if (time1 > time2) System.out.println("And the winner is " + moto2.name);
        else System.out.println("And the winner is " + moto1.name);
        System.out.println();
    }
}
