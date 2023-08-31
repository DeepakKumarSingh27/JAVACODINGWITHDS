package com.OOPS.EnumsExample;

public class Basic  {
    enum Week implements A{
        mon,tue,wed,thu,fri,sat,sun;
     Week() {
         System.out.println("constructor "+ this);
     }

        @Override
        public void Hello() {
            System.out.println("how are you");

        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.mon;
        week.Hello();
//        for (week day : week.values()) {
//            System.out.println(day);
//        }
     //   System.out.println(week.ordinal());
    }
}
