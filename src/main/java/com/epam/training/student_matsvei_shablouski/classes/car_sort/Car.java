package com.epam.training.student_matsvei_shablouski.classes.car_sort;


import com.epam.training.student_matsvei_shablouski.classes.car_sort.konst.Brand;
import com.epam.training.student_matsvei_shablouski.classes.car_sort.konst.Color;

public class Car {

    private Brand brand;
    private String model;
    private int id;
    private int year;
    private int registrationNumber;
    private int price;
    private Color color;


    public Car(Brand brand, String model, int id, int year, int registrationNumber, int price, Color color) {
        this.brand = brand;
        this.model = model;
        this.id = id;
        this.year = year;
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.color = color;
    }

    public Brand getBrand() {return brand;}

    public void setBrand(Brand brand) {this.brand = brand;}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", id=" + id +
                ", year=" + year +
                ", registrationNumber=" + registrationNumber +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
