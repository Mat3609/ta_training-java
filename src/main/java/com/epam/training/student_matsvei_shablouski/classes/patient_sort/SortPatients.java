package com.epam.training.student_matsvei_shablouski.classes.patient_sort;

import java.util.ArrayList;
import java.util.List;

public class SortPatients implements SortMethods {

    List<Patient> patients;

    public SortPatients() {
        patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }


    @Override
    public List<Patient> listOfPatientsWithThisDiagnosis(String diagnosis) {
        for (Patient p : patients) {
            if (p.getDiagnosis() == diagnosis.trim()) System.out.println(p.toString());
        }
        return patients;
    }

    @Override
    public List<Patient> listPatientsNumberMedCardGivenInterval(int fromThis, int toThis) {
        for (Patient p : patients) {
            if (p.getNumberMedicalCard() >= fromThis && p.getNumberMedicalCard()<= toThis) System.out.println(p.toString());
        }
        return patients;
    }
}
