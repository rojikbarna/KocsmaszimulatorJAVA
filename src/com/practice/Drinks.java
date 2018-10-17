package com.practice;

public class Drinks {
    String name;
    private int price;
    private int alkoholpercent;

    Drinks(){
    }

    Drinks(String name, int price, int alkoholpercent){
        this.name = name;
        this.price = price;
        this.alkoholpercent = alkoholpercent;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getAlkoholpercent() {
        return alkoholpercent;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAlkoholpercent(int alkoholpercent) {
        this.alkoholpercent = alkoholpercent;
    }
    public String toString() {
        return "Price: " + price +
                ", alcoholPercent: " + alkoholpercent;
    }
}
