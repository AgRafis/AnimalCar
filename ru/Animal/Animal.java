package ru.Animal;
//Создайте класс Animal и его класс-наследник Cat. В базовом классе задайте поле
//для имени, а в классе-наследнике сделайте метод drinkMilk(), который будет выводить
//в консоль строку “Кошка пьёт воду”. Создайте объект и задайте кошке имя, а затем
//вызовите метод drinkMilk()
public class Animal {
    String nickname;

    public Animal(String nickname) {
        this.nickname = nickname;
    }
}
