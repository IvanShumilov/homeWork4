package ru.shumilov.ia.animal.bear;

import ru.shumilov.ia.animal.Animal;

public class Bear extends Animal {

    Bear(String name) {
        super(name);
        setType("Медведь");
    }

    public void talk() {
        super.talk("Arrrr");
    }
}
