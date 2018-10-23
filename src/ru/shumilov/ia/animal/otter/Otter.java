package ru.shumilov.ia.animal.otter;

import ru.shumilov.ia.animal.Animal;

public class Otter extends Animal {
    Otter(String name) {
        super(name);
        setType("Выдра");
    }
    public void talk() {
        super.talk("Prrr");
    }
}
