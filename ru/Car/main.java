package ru.Car;

public class main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(car1.status);
        car1.startCar(car1);
        System.out.println(car1.status);
        car2.stopCar();
        System.out.println(car2.status);

        Car car3 = new Car();
        car3.setYear(2020);
        System.out.println(car3.getYear());
        //car3.year = 2020;
        //System.out.println(car3.year);

        Car car4 = new Car();
        car4.setType("crossover");
        System.out.println(car4.getType());
        //car4.type = "crossover";
        //System.out.println(car4.type);

        Car car5 = new Car();
        car5.setColor("gray");
        System.out.println(car5.getColor());
        //car5.color = "gray";
        //System.out.println(car5.color);
    }

}
