package ru.stepik;

public class Puffendui extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Puffendui(String name, int magic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public String toString() {
        return "Имя: " + getName() + " Магия: " + getMagic() + " Трансгрессия: " + getTransgression() + " Трудолюбие: " +
                diligence + " Верность: " + loyalty + " Честность: " + honesty;
    }
}
