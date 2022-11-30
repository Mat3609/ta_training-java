package com.epam.training.student_matsvei_shablouski.classes.car_sort;



import com.epam.training.student_matsvei_shablouski.classes.car_sort.konst.Brand;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortCars implements Finding {

    private List<Car> carList;

    public SortCars() {
        carList = new ArrayList<> ();
    }

    public void addCar(Car car) {
        carList.add (car);
    }



    @Override
    public List<Car> listCarsOfThisBrand(Brand brand) {
        //1
//        List<Car> newList = new ArrayList<> ();
//        for (Car car : carList) {
//            if (car.getBrand ().equals (brand)) newList.add (car);
//        }
//        return newList;

        //2
        return carList.stream ()
                .filter (car -> car.getBrand ().equals (brand))
                .collect(Collectors.toList());
    }

    @Override
    public List<Car> listCarsOfThisBrandWhichUseMoreThanNnYears(Brand brand, int years) {
//  збс
        int year = 2022 - years;
        return carList.stream().filter(car -> car.getBrand().equals(brand) && car.getYear() < year).collect(Collectors.toList());

//  Колхоз
//        List<Car> newList = new ArrayList<>();
//        for (Car car : carList) {
//            if (car.getBrand().equals(brand) && car.getYear() < year) newList.add(car);
//        }
//        return newList;
    }

    @Override
    public List<Car> listCarsOfThisYearsPriseMoreThanGiven(int years, int price) {
        return carList.stream().filter(car -> car.getYear() == years && car.getPrice() > price).collect(Collectors.toList());
    }
}
