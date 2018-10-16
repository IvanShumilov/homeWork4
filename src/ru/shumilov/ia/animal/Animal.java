package ru.shumilov.ia.animal;

public abstract class Animal {

    private String name;
    private String type;
    private String breed;
    private boolean die;
    private boolean sleep;
    private boolean awake;

    public Animal(String name) {
        this.name = name;
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

    private boolean isDie() {
        return die;
    }

    public final void setDie(boolean die) {
        if (isDie()) {
            System.out.println("Sorry " + getName() + " is die");
        } else {
            this.die = die;
        }
    }

    private boolean isSleep() {
        return sleep;
    }

    public final void setSleep(boolean sleep) {
        if (isDie()) {
            System.out.println("Sorry " + getName() + " is die");
        } else {
            this.sleep = sleep;
        }
    }

    public final boolean isAwake() {
        return awake;
    }

    public final void setAwake(boolean awake) {
        if (isDie()) {
            System.out.println("Sorry " + getName() + " is die");
        } else {
            this.awake = awake;
        }
    }

    public void getAbout() {
        if (getName().isEmpty() || getBreed().isEmpty() || getType().isEmpty()) {
            System.out.println("Что-то пошло не так, пустые значение имени породы или типа животного");
        } else {
            System.out.println(getType() + ", " + getBreed() + ", " + getName());
        }
    }

    protected void talk(String sayWhat) {
        if (!isDie() && !isSleep()) {
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
        if (!getType().equalsIgnoreCase(other.getType()))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((getType() == null) ? 0 : getType().hashCode()) + ((getBreed() == null) ? 0 : getBreed().hashCode());
        return result;
    }


}
