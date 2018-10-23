package ru.shumilov.ia.animal;

import org.jetbrains.annotations.NotNull;
import ru.shumilov.ia.annotations.Domesticated;

public abstract class Animal {

    private String name;
    private String type;
    private String breed;
    private Flags state;

    public Animal(String name) {

        this.name = name;
        state = Flags.BORN;
    }

    public String getName() {
        return name;
    }

    private String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    private String getBreed() {
        return breed;
    }

    protected void setBreed(String breed) {
        this.breed = breed;
    }

    public final void setDie() {
        if (Flags.DEAD == state) {
            System.out.println("Sorry " + getName() + " is die");
        }
        state = Flags.DEAD;
    }

    public final void setSleep() {
        if (Flags.DEAD == state) {
            System.out.println("Sorry " + getName() + " is die");
        }
        state = Flags.SLEEPING;
    }

    public final void setAwake() {
        if (Flags.DEAD == state) {
            System.out.println("Sorry " + getName() + " is die");
        }
        state = Flags.AWAKEN;
    }

    public void getAbout() {
        if (getName().isEmpty() || getBreed().isEmpty() || getType().isEmpty()) {
            System.out.println("Что-то пошло не так, пустые значение имени породы или типа животного");
        } else {
            System.out.println(getType() + ", " + getBreed() + ", " + getName());
        }
    }

    protected void talk(String sayWhat) {

        if ((Flags.BORN == state) || (Flags.AWAKEN == state)) {
            System.out.println(sayWhat);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        if (!getBreed().equalsIgnoreCase(other.getBreed()))
            return false;
        return getType().equalsIgnoreCase(other.getType());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((getType() == null) ? 0 : getType().hashCode()) + ((getBreed() == null) ? 0 : getBreed().hashCode());
        return result;
    }

    public void checkDomesticated() {
        Domesticated[] annotations = this.getClass().getAnnotationsByType(Domesticated.class);
        for (Domesticated learning : annotations) {
            System.out.println("Аннотация: " + learning.toString());
            System.out.println("Утверждает что животное: \"" + this.getType() + "\"  \"" + learning.domesticated());
        }
    }

    public static void checkArrayDomesticated(@NotNull Animal ... animals){
        for(Animal animal : animals){
            animal.checkDomesticated();
        }

    }

    enum Flags {
        SLEEPING,
        AWAKEN,
        BORN,
        DEAD
    }
}
