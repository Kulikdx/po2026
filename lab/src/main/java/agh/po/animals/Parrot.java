package agh.po.animals;

public class Parrot extends Animal {
    public Parrot() {
        name = "Papuga";
        legs = 2;
    }

    public String getDescription() {
        return "Papuga";
    }

    public void makeSound() {
        System.out.println("cwir");
    }
}