package com.epam.training.student_matsvei_shablouski.classes.patient_sort;

import java.util.List;

public interface SortMethods {
    List<Patient> listOfPatientsWithThisDiagnosis(String diagnosis);
    List<Patient> listPatientsNumberMedCardGivenInterval(int fromThis, int toThis);
}
