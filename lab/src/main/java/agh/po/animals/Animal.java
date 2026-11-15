package agh.po.animals;

public abstract class Animal {
    String name;
    int legs;

    public abstract String getDescription();

    public int getLegs() {
        return legs;
    }

    public void makeSound() {
        System.out.println("...");
    }
}