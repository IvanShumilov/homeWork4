package ru.shumilov.ia.animal.cats;

import ru.shumilov.ia.animal.Animal;
import ru.shumilov.ia.annotations.Domesticated;

@Domesticated
public class Cat extends Animal {

    Cat(String name) {
        super(name);
        setType("Кошка");
    }

    public void talk()
    {
        super.talk("Meow");
    }
}
