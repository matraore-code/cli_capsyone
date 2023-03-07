package com.matraore.car;

public class CarDAO {
    private static Car[] cars;
    private static int nexAvailableIndex = 0;

    private static final int CAPACITY = 5 ;

    static {
        cars = new Car[CAPACITY];
    }

    public static void saveCar(Car car) {

        cars[nexAvailableIndex] = car;
        nexAvailableIndex++;
    }
}
