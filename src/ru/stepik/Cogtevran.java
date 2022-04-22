package ru.stepik;

public class Cogtevran extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Cogtevran(String name, int magic, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, magic, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public String toString() {
        return "Имя: " + getName() + " Магия: " + getMagic() + " Трансгрессия: " + getTransgression() + " Ум: " +
                mind + " Мудрость: " + wisdom + " Остроумие: " + wit + " Креативность: " + creativity;
    }
}
