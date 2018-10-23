package ru.shumilov.ia.animal.cows;

import ru.shumilov.ia.animal.Animal;
import ru.shumilov.ia.annotations.Domesticated;

@Domesticated
public class Cow extends Animal {
    Cow(String name) {
        super(name);
        setType("Корова");
    }

    public void talk() {
        super.talk("Muu");
    }
}
