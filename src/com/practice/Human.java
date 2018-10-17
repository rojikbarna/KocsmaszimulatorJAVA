package com.practice;

public class Human {

    String name;
    int age;
    boolean gender;
    private int money;
    int drunkness;
    boolean inPub;


    public Human(String name, int age, boolean gender, int money) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.money = money;
        this.drunkness = 0;
        this.inPub = false;
    }

    public String toString () {
        return "Name: " + name +
                ", Age: " + age +
                ", Gender: " + gender +
                ", Money: " + money +
                ", Drunkness: " + drunkness +
                ", is in pub: " + inPub;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void drinking(Innkeeper innkeeper) {
        if (inPub) {
            money -= 1;
            drunkness += 1;
            Innkeeper.koszospohár+=1;
            innkeeper.setMoney(innkeeper.getMoney() + 1);
            if (drunkness <40) {
                System.out.println(name + " drinking endlessly");
            } else {
                System.out.println(name + " drank too much passd out ");
                alszik();
            }
        } else {
            System.out.println(name + " is not in the pub ");
        }
    }
    public void drinking(Innkeeper innkeeper, Drinks drinks){
        if (inPub){
            money-= drinks.getPrice();
            drunkness += drinks.getAlkoholpercent();
            Innkeeper.koszospohár+=1;
            innkeeper.setMoney(innkeeper.getMoney()+ drinks.getPrice());
            if (drunkness< 40){
                System.out.println(name + " Drinking "+ drinks.getName() );
            } else {
                System.out.println(name +  " drank to much passd out !");
            }
        }
    }
    void alszik(){
        drunkness = 0;
        System.out.println(name + " is asleep ");
    }
    public void hazamegy() {
        if (inPub){
            inPub = false;
            System.out.println(name + " went home ");
        } else {
            System.out.println(name + " is already home");
        }
    }
    public void kocsmábamegy(){
        if (inPub){
            System.out.println(name + " is already in the pub");
        } else {
            inPub = true;
            System.out.println(name + " going to the pub ");
        }
    }
    public void köszön(){
        if (gender){
            System.out.println("hi my name is "+ name + "i am "+ age + " years old and i am a male ");
        } else {
            System.out.println("hi my name is " + name + " i am " + age + " years old and i am a female ");
        }
    }
    public void fighting(Human otherman){
        if (Bouncer.workingBouncers !=0){
            System.out.println(+ " kicked out "+
            name + " bc he started a fight with "+ otherman.name);
            hazamegy();
        } else {
            System.out.println(name + " and "+ otherman.name + " starts a fight");
        }
    }
}
