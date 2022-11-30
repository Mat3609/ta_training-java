package com.epam.training.student_matsvei_shablouski.classes.patient_sort;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Dmitry", "Khrolovich", "Autism", 46);
        Patient patient1 = new Patient("Sasha", "Shaushenko", "Anurez", 52);
        Patient patient2 = new Patient("Volodya", "Putler", "Marazm", 53);
        Patient patient3 = new Patient("Gitler", "Adolf", "Psihoz", 66);
        Patient patient4 = new Patient("Stalin", "Iosif", "Diareya", 62);
        Patient patient5 = new Patient("Kabzon", "Iosif", "Marazm", 48);
        Patient patient6 = new Patient("Ganibal", "Lector", "Psihopat", 50);

        SortPatients sortPatients = new SortPatients();
        sortPatients.addPatient(patient);
        sortPatients.addPatient(patient1);
        sortPatients.addPatient(patient2);
        sortPatients.addPatient(patient3);
        sortPatients.addPatient(patient4);
        sortPatients.addPatient(patient5);
        sortPatients.addPatient(patient6);


        sortPatients.listPatientsNumberMedCardGivenInterval(48, 58);
    }
}
