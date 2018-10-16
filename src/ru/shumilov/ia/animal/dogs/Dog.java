package ru.shumilov.ia.animal.dogs;

import ru.shumilov.ia.animal.Animal;

public class Dog extends Animal {

    Dog(String name) {
        super(name);
        setType("Собака");
    }

    public void talk() {
        super.talk("Woof");
    }
}
