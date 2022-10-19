package com.epam.training.student_matsvei_shablouski.classes.train_schedule;

import java.util.List;

public interface SortTrain {
    List<Train> listOfTrainsGoingToGivenDest(String destination);
    List<Train> listOfTrainsGoingToGivenDestDepartingAfterSpecifHour(String destination, int givenHour);
    List<Train> listOfTrainsGoingToGivenDestHaveGeneralPlaces(String destination);
}
