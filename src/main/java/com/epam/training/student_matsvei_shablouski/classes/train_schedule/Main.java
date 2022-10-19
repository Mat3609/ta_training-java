package com.epam.training.student_matsvei_shablouski.classes.train_schedule;

public class Main {
    public static void main(String[] args) {

        Train train1 = new Train(12, new TypPlaces(12, 67, 15, 18), "London", 1800);
        Train train2 = new Train(13, new TypPlaces(0, 72, 37, 2), "London", 1345);
        Train train3 = new Train(14, new TypPlaces(111, 47, 24, 22), "London", 1025);
        Train train4 = new Train(15, new TypPlaces(0, 49, 24, 33), "London", 1235);
        Train train5 = new Train(16, new TypPlaces(313, 26, 57, 6), "London", 2115);
        Train train55 = null;
        Train train6 = new Train(17, new TypPlaces(262, 46, 14, 13), "Parish", 2355);
        Train train7 = new Train(18, new TypPlaces(125, 73, 75, 35), "Parish", 1435);
        Train train8 = new Train(19, new TypPlaces(217, 16, 64, 21), "Parish", 1655);
        Train train9 = new Train(20, new TypPlaces(122, 23, 42, 4), "Krakow", 1925);
        Train train10 = new Train(21, new TypPlaces(117, 3, 36, 2), "Krakow", 1700);
        Train train11 = new Train(22, new TypPlaces(322, 12, 56, 18), "Krakow", 845);


        Schedule schedule = new Schedule();

        schedule.addTrain(train1);
        schedule.addTrain(train2);
        schedule.addTrain(train3);
        schedule.addTrain(train4);
        schedule.addTrain(train5);
        schedule.addTrain(train55);
        schedule.addTrain(train6);
        schedule.addTrain(train7);
        schedule.addTrain(train8);
        schedule.addTrain(train9);
        schedule.addTrain(train10);
        schedule.addTrain(train11);


        schedule.listOfTrainsGoingToGivenDest("Krakow").stream().forEach(train -> System.out.println(train.toString()));
        System.out.println();
//        schedule.listOfTrainsGoingToGivenDestDepartingAfterSpecifHour("Parish", 1500).stream().forEach(train -> System.out.println(train.toString()));
//        System.out.println();
//        schedule.listOfTrainsGoingToGivenDestHaveGeneralPlaces("London").stream().forEach(train -> System.out.println(train.toString()));


    }
}
