package com.epam.training.student_matsvei_shablouski.classes.train_schedule;

public class Train {
    private int numberTrain;
    private TypPlaces places;
    private String destination;
    private int timeDepart;

    public Train() {
    }

    public Train(int numberTrain, TypPlaces places, String destination, int timeDepart) {
        this.numberTrain = numberTrain;
        this.places = places;
        this.destination = destination;
        this.timeDepart = timeDepart;
    }

    public int getNumberTrain() {
        return numberTrain;
    }

    public void setNumberTrain(int numberTrain) {
        this.numberTrain = numberTrain;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTimeDepart() {
        return timeDepart;
    }

    public void setTimeDepart(int timeDepart) {
        this.timeDepart = timeDepart;
    }

    public TypPlaces getPlaces() {
        return places;
    }

    public void setPlaces(TypPlaces places) {
        this.places = places;
    }

    @Override
    public String toString() {
        return "Train{" +
                "numberTrain=" + numberTrain +
                ", places=" + places.toString() +
                ", destination='" + destination + '\'' +
                ", timeDepart=" + timeDepart +
                '}';
    }
}
