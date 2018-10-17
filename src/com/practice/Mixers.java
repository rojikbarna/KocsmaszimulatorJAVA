package com.practice;

public class Mixers extends Drinks{
    public Mixers(String name, Drinks[] drinks){
        this.name = name;
        int price = 0;
        int alkohol = 0;

        for (int i = 0; i<drinks.length;i++){
            price+=drinks[i].getPrice();
        }
        for (int j =0;j<drinks.length;j++){
            alkohol+=drinks[j].getAlkoholpercent();
        }
        setPrice(price/drinks.length);
        setAlkoholpercent(alkohol/drinks.length);
    }
    public Mixers(String name , Drinks drink1, Drinks drink2, Drinks drink3, Drinks drink4){
        this.name = name;
        setPrice((drink1.getPrice()+drink2.getPrice()+drink3.getPrice()+drink4.getPrice())/4);
        setAlkoholpercent((drink1.getAlkoholpercent()+drink2.getAlkoholpercent()+drink3.getAlkoholpercent()+drink4.getAlkoholpercent())/4);
    }

}
