package com.practice;

public class Main {
    public static void main(String[] args){
        Human jani = new Human("jani", 32,true,21);
        Human jozsi = new Human("jozsi",21,true,12);
        Innkeeper juli = new Innkeeper("juli", 32,false, 21);
        Bouncer joli = new Bouncer("joli",2,false,21,false);
        Student jancsi = new Student("jancsi",12,true,0,12);
        Drinks valami = new Drinks("valami",123,12);
        Drinks nemtom = new Drinks("nemtom",112,100);
        Drinks tea = new Drinks("tea", 2,0);
        Drinks viz = new Drinks("viz", 1,0);
        Beer kobambi = new Beer("kobambi",12,6);
        Wine merlot = new Wine("merlot", 121,12,1990);
        Mixers roka = new Mixers("roka",kobambi,tea,valami,viz);
        Drinks[] rossz = {merlot,nemtom,valami,kobambi};
        Mixers hadada = new Mixers("hadada",rossz);
        Bouncer zoli = new Bouncer("zoli",3,true,12,false);


        jani.kocsmábamegy();
        jani.drinking(juli);
        jozsi.kocsmábamegy();
        jozsi.drinking(juli,kobambi);
        juli.elmos();
        jani.fighting(jozsi);
        jani.hazamegy();
        joli.kocsmábamegy();
        joli.startsWorking();
        jani.fighting(jozsi);
        joli.drinking(juli,viz);
        jancsi.learning(3);
        jozsi.drinking(juli,roka);
        jozsi.drinking(juli,hadada);
        joli.stopsWorking();






    }
}
