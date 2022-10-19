package com.epam.training.student_matsvei_shablouski.classes.train_schedule;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Schedule implements SortTrain {


    private List<Train> listTrain;

    public Schedule() {
        listTrain = new ArrayList<>();
    }

    public void addTrain(Train train) {
        listTrain.add(train);
    }



    @Override
    public List<Train> listOfTrainsGoingToGivenDest(String destination) {
//        List<Train> trains = new ArrayList<>();
//
//        for (Train train : listTrain) {
//            if (train == null) {
//                System.out.println("Null");
//            }
//            else if (train.getDestination().equals(destination)) {
//                trains.add(train);
//            }
//        }

          return listTrain.stream().filter(train -> train.getDestination().equals(destination)).collect(Collectors.toList());
    }

    @Override
    public List<Train> listOfTrainsGoingToGivenDestDepartingAfterSpecifHour(String destination, int givenHour) {
        return listTrain.stream().filter(train -> train.getDestination().equals(destination) && train.getTimeDepart() > givenHour).collect(Collectors.toList());
    }

    @Override
    public List<Train> listOfTrainsGoingToGivenDestHaveGeneralPlaces(String destination) {
        return listTrain.stream().filter(train -> train.getDestination().equals(destination) && train.getPlaces().getGeneral() > 0).collect(Collectors.toList());
    }
}
