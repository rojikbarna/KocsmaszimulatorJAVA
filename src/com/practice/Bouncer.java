package com.practice;

public class Bouncer extends Human {
    private boolean working;
    static int workingBouncers=0;

    Bouncer(String name, int age, boolean gender, int money,boolean working) {
        super(name, age, gender, money);
        this.working = working;
        if (this.working){
            workingBouncers +=1;
            inPub = true;
        }
    }

    public void startsWorking() {
        if (inPub && working) {
            System.out.println("already working");
        } else if (inPub && !working) {
            working = true;
            workingBouncers += 1;
            System.out.println(name + " started working");
        } else {
            System.out.println(name + " have to got to the pub to start working ");
        }
    }
    public void stopsWorking(){
        if (working){
            working= false;
            workingBouncers-=1;
            System.out.println(name + " stopped working");
        } else {
            System.out.println(name + " already left to home");
        }
    }

    public boolean isWorking() {
        return working;
    }

    @Override
    public void drinking(Innkeeper innkeeper) {
        if (working){
            System.out.println("cant drink while working");
        } else {
            super.drinking(innkeeper);
        }
    }

    @Override
    public void drinking(Innkeeper innkeeper, Drinks drinks) {
        if (working&& drinks.getAlkoholpercent() !=0){
            System.out.println(name + "can't drink alkohol while woeking ");
        } else {
            super.drinking(innkeeper, drinks);
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "\nWorking?:"+ working+"\nWorking bouncers currently:"+ workingBouncers;
    }
}
