package ru.Animal;

public class Cat extends Animal{

    public Cat(String nickname){
        super(nickname);
    }
//super будет работать без создания конструктора в классе Animal?
//У меня так не работает. Может что-то не так делаю?

    public static void drinkMilk(){
        System.out.println("Кошка пьёт воду");
    }
}
