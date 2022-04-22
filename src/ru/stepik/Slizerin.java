package ru.stepik;

public class Slizerin extends Hogwarts {
    private int cunning;
    private int decisiveness;
    private int ambition;
    private int resourcefulness;
    private int power;

    public Slizerin(String name, int magic, int transgression, int cunning, int decisiveness, int ambition, int resourcefulness, int power) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String toString() {
        return "Имя: " + getName() + " Магия: " + getMagic() + " Трансгрессия: " + getTransgression() + " Хитрость: " +
                cunning + " Решительность: " + decisiveness + " Амбициозность: " + ambition + " Находчивость: "
                + resourcefulness + " Жажда власти: " + power;
    }
}
