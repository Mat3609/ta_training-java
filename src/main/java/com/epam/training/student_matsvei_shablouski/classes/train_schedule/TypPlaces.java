package com.epam.training.student_matsvei_shablouski.classes.train_schedule;

class TypPlaces {

    private int general;
    private int coupe;
    private int reserved_seat;
    private int luxury;

    public TypPlaces(int general, int coupe, int reserved_seat, int luxury) {
        this.general = general;
        this.coupe = coupe;
        this.reserved_seat = reserved_seat;
        this.luxury = luxury;
    }

    public int getGeneral() {
        return general;
    }

    public int getCoupe() {
        return coupe;
    }

    public int getReserved_seat() {
        return reserved_seat;
    }

    public int getLuxury() {
        return luxury;
    }

    @Override
    public String toString() {
        return "TypPlaces{" +
                "general=" + general +
                ", coupe=" + coupe +
                ", reserved_seat=" + reserved_seat +
                ", luxury=" + luxury +
                '}';
    }
}
