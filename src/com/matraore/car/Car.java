package com.matraore.car;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {
    private String regNumber;
    private BigDecimal rentingPricePerDay;
    private boolean isElectric;
    private Brand brand;
    public boolean isBooked;

    public Car(String regNumber, BigDecimal rentingPricePerDay, boolean isElectric, Brand brand) {
        this.regNumber = regNumber;
        this.rentingPricePerDay = rentingPricePerDay;
        this.isElectric = isElectric;
        this.brand = brand;
    }

    public Car() {
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public BigDecimal getRentingPricePerDay() {
        return rentingPricePerDay;
    }

    public void setRentingPricePerDay(BigDecimal rentingPricePerDay) {
        this.rentingPricePerDay = rentingPricePerDay;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return isElectric == car.isElectric && Objects.equals(regNumber, car.regNumber) && Objects.equals(rentingPricePerDay, car.rentingPricePerDay) && brand == car.brand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, rentingPricePerDay, isElectric, brand);
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNumber='" + regNumber + '\'' +
                ", rentingPricePerDay=" + rentingPricePerDay +
                ", isElectric=" + isElectric +
                ", brand=" + brand +
                '}';
    }
}
