package ru.Animal;

import static ru.Animal.Cat.drinkMilk;

public class main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        System.out.println(cat1.nickname);
        drinkMilk();

    }
}
