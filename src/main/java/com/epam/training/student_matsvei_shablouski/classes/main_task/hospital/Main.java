package com.epam.training.student_matsvei_shablouski.classes.main_task.hospital;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Dmitry", "Khrolovich", Diagnosis.AUTISM, 46);
        Patient patient1 = new Patient("Sasha", "Shaushenko", Diagnosis.ANUREZ, 52);
        Patient patient2 = new Patient("Volodya", "Putler", Diagnosis.MARAZM, 53);
        Patient patient3 = new Patient("Adolf", "Hitler", Diagnosis.PSIHOZ, 66);
        Patient patient4 = new Patient("Iosif", "Stalin", Diagnosis.ANUREZ, 62);
        Patient patient5 = new Patient("Iosif", "Kabzon", Diagnosis.MARAZM, 48);
        Patient patient6 = new Patient("Lector", "Ganibal", Diagnosis.PSIHOZ, 50);

        Hospital sortPatients = new Hospital();
        sortPatients.addPatient(patient);
        sortPatients.addPatient(patient1);
        sortPatients.addPatient(patient2);
        sortPatients.addPatient(patient3);
        sortPatients.addPatient(patient4);
        sortPatients.addPatient(patient5);
        sortPatients.addPatient(patient6);


       // System.out.println(sortPatients.getListOfPatientsWithThisDiagnosis(Diagnosis.PSIHOZ));
        System.out.println(sortPatients.getListPatientsNumberMedCardGivenInterval(50, 60));

    }
}
