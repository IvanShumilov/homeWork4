package ru.shumilov.ia.animal.wolf;

import ru.shumilov.ia.animal.Animal;

public class Wolf extends Animal {
    Wolf(String name) {
        super(name);
        setType("Волк");
    }

    public void talk() {
        super.talk("wolf saying bee");
    }
}
