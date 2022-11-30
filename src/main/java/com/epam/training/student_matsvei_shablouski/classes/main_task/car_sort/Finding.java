package com.epam.training.student_matsvei_shablouski.classes.car_sort;



import com.epam.training.student_matsvei_shablouski.classes.car_sort.konst.Brand;

import java.util.List;

public interface Finding {
    List<Car> listCarsOfThisBrand(Brand brand);
    List<Car> listCarsOfThisBrandWhichUseMoreThanNnYears(Brand brand, int years);
    List<Car> listCarsOfThisYearsPriseMoreThanGiven(int years, int price);
}
