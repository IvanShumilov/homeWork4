package ru.shumilov.ia;

import ru.shumilov.ia.animal.cats.Bombay;
import ru.shumilov.ia.animal.cats.Persian;
import ru.shumilov.ia.animal.dogs.Basenji;
import ru.shumilov.ia.animal.dogs.Beagle;

public class Main {

    public static void main(String[] args) {

        Beagle beagle = new Beagle("Rex");
        Beagle beagle1 = new Beagle("Rex");
        Basenji basenji = new Basenji("Bes");

        beagle.getAbout();
        beagle.talk();
        System.out.println("set die");
        beagle.setDie(true);
        beagle.talk();


        Persian pers = new Persian("Felix");
        pers.getAbout();
        pers.talk();
        System.out.println("set sleep");
        pers.setSleep(true);


        Bombay bombay = new Bombay("Macharadz");
        bombay.getAbout();
        bombay.talk();
        System.out.println("set sleep");
        bombay.setSleep(true);
        bombay.talk();
        System.out.println("set wakeup");
        bombay.setSleep(false);
        bombay.talk();
        System.out.println(bombay.getName() + " is walk");
        bombay.setAwake(true);
        bombay.talk();
        bombay.setDie(true);
        bombay.setAwake(false);


        System.out.println(bombay.hashCode());

        Bombay bombay1 = new Bombay("Felix");
        Bombay bombay2 = new Bombay("Felix");

        int i = 1;
        System.out.println((bombay1.equals(bombay2)) + " #" + String.valueOf(i++));
        System.out.println(bombay.equals(bombay2) + " #" + String.valueOf(i++));
        System.out.println(pers.equals(bombay2)+ " #" + String.valueOf(i++));
        System.out.println(beagle.equals(beagle1)+ " #" + String.valueOf(i++));
        System.out.println(beagle.equals(basenji)+ " #" + String.valueOf(i++));
        System.out.println(beagle.equals(pers)+ " #" + String.valueOf(i++));
    }
}
