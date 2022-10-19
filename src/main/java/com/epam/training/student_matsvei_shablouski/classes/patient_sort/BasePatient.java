package com.epam.training.student_matsvei_shablouski.classes.patient_sort;

public abstract class BasePatient {
    String name;
    String surname;
    String diagnosis;
    int numberMedicalCard;



    public abstract String getName();

    public abstract void setName(String name);

    public abstract String getSurname();

    public abstract void setSurname(String surname);

    public abstract String getDiagnosis();

    public abstract void setDiagnosis(String diagnosis);

    public abstract int getNumberMedicalCard();

    public abstract void setNumberMedicalCard(int numberMedicalCard);

    @Override
    public abstract String toString();
}
