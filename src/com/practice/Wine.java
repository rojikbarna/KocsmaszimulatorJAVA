package com.practice;

public class Wine extends Drinks {
    private int vintage;

    public Wine(String name, int price, int alkoholpercent,int vintage){
        super(name,price,alkoholpercent);
        this.vintage = vintage;
    }

    public int getVintage() {
        return vintage;
    }

    public void setVintage(int vintage) {
        this.vintage = vintage;
    }

    @Override
    public String toString() {
        return super.toString()+ "vintage: "+ vintage;
    }
}
