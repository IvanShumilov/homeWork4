package ru.shumilov.ia.animal.lynx;

import ru.shumilov.ia.animal.Animal;

public class Lynx extends Animal {
    Lynx(String name) {
        super(name);
        setType("Рысь");
    }
    public void talk() {
        super.talk("Murrr");
    }
}
