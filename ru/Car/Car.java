package ru.Car;
//Напишите программу с классом Car.
//        ● Создайте конструктор класса Car.
//        ● Создайте атрибуты класса Car — color (цвет), type (тип), year (год).
//        ● Напишите пять методов:
//        ○ Первый — запуск автомобиля, при его вызове выводится сообщение «Автомобиль заведен».
//        ○ Второй — отключение автомобиля — выводит сообщение «Автомобиль заглушен».
//        ○ Третий — присвоение автомобилю года выпуска.
//        ○ Четвертый метод — присвоение автомобилю типа.
//        ○ Пятый — присвоение автомобилю цвета.
public class Car {
    String color;
    String type;
    int year;
    boolean status;

    public Car(){
        status = false;
    }
    public void startCar(Car car){
        if (car.status == true) {
            System.out.println("Автомобиль уже заведен");
        }
        else {
            System.out.println("Автомобиль заведен");
            status = true;
        }
    }
    public void stopCar(){
        System.out.println("Автомобиль заглушен");
        status = false;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}
