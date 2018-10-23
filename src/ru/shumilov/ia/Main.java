package ru.shumilov.ia;

import ru.shumilov.ia.animal.Animal;
import ru.shumilov.ia.animal.bear.Bear;
import ru.shumilov.ia.animal.bear.WhiteBear;
import ru.shumilov.ia.animal.cats.*;
import ru.shumilov.ia.animal.cows.MilkaCow;
import ru.shumilov.ia.animal.dogs.*;
import ru.shumilov.ia.animal.wolf.White;
import ru.shumilov.ia.calendar.Week;

public class Main {

    public static void main(String[] args) {

        Beagle beagle = new Beagle("Rex");
        Beagle beagle1 = new Beagle("Rex");
        Basenji basenji = new Basenji("Bes");

        beagle.getAbout();
        beagle.talk();
        System.out.println("set die");
        beagle.setDie();
        beagle.talk();


        Persian pers = new Persian("Felix");
        pers.getAbout();
        pers.talk();
        System.out.println("set sleep");
        pers.setSleep();


        Bombay bombay = new Bombay("Macharadz");
        bombay.getAbout();
        bombay.talk();
        System.out.println("set sleep");
        bombay.setSleep();
        bombay.talk();
        System.out.println("set wakeup");
        bombay.setAwake();
        bombay.talk();
        System.out.println(bombay.getName() + " is walk");
        bombay.setAwake();
        bombay.talk();
        bombay.setDie();
        bombay.setAwake();



        Bombay bombay1 = new Bombay("Felix");
        Bombay bombay2 = new Bombay("Felix");
        Javanese jap = new Javanese("Felix");



//        Бонус к домашней работе

        Week.getDay();

        Bear bear = new WhiteBear("Burny");

        bear.getAbout();

        beagle.checkDomesticated();

        Animal.checkArrayDomesticated(beagle, beagle1, jap, bear, bombay, bombay1, bombay2, basenji, new White("Grey"), new MilkaCow("Burenka"));
    }
}
