package agh.po.zadania;

import agh.po.animals.*;
import java.util.Random;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[100];
        Random random = new Random();

        for (int i = 0; i < animals.length; i++) {
            int los = random.nextInt(3);
            if (los == 0) animals[i] = new Dog();
            else if (los == 1) animals[i] = new Parrot();
            else animals[i] = new Snake();
        }

        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            System.out.println(animal.getDescription());
            int legs = animal.getLegs();
            animal.makeSound();
        }

        System.out.println("Suma nóg: " + sumaNog(animals));
    }

    public static int sumaNog(Animal[] animals) {
        int suma = 0;
        for (int i = 0; i < animals.length; i++) {
            suma += animals[i].getLegs();
        }
        return suma;
    }
}