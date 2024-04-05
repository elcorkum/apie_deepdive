package enumerationdemo;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Days day = Days.FRIDAY;
        System.out.println(day);

        Days[] days = Days.values();
        //this is a method of the enum class
        for (Days d: days) {
            System.out.println(d);
        }



        if (day == Days.SATURDAY) {
            System.out.println("Friday forum day");
        } else if (day == Days.SATURDAY || day == Days.SUNDAY) {
            System.out.println("It's the weekend");
        }


        switch(day) {
            case MONDAY :
                System.out.println("Not yet weekend");
                break;
            case SATURDAY, SUNDAY:
                System.out.println("It is the weekend!");
                break;
            default:
                System.out.println("Just another day at year up");
        }
    }
}
