package com.epam.training.student_matsvei_shablouski.classes.patient_sort;

public class  Patient extends BasePatient {

   private String name;
   private String surname;
   private String diagnosis;
   private int numberMedicalCard;

    public Patient(String name, String surname, String diagnosis, int numberMedicalCard) {
        this.name = name;
        this.surname = surname;
        this.diagnosis = diagnosis;
        this.numberMedicalCard = numberMedicalCard;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public int getNumberMedicalCard() {
        return numberMedicalCard;
    }

    @Override
    public void setNumberMedicalCard(int numberMedicalCard) {
        this.numberMedicalCard = numberMedicalCard;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", numberMedicalCard=" + numberMedicalCard +
                '}';
    }
}
