package com.practice;

public class Innkeeper extends Human {
    static int koszospohár=0;


    Innkeeper(String name, int age, boolean gender, int money){
        super(name,age, gender, money);
        inPub = true;
    }

    public static int getKoszospohár() {
        return koszospohár;
    }

    public static void setKoszospohár(int koszospohár) {
        Innkeeper.koszospohár = koszospohár;
    }

    public void elmos() {
        if (koszospohár !=0) {
            koszospohár--;
            System.out.println(name + " washed one glass.");
        } else {
            System.out.println("no more dirty glass left");
        }
    }
    @Override
    public String toString() {
        return super.toString() + "\nCurrent number of dirty glasses: " + koszospohár;
    }
}
