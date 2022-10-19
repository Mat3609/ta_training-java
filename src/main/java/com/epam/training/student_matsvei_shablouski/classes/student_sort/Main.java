package com.epam.training.student_matsvei_shablouski.classes.student_sort;


public class Main {
    public static void main(String[] args) {

        Student student = new Student(2233, "Andy", "Bayker street 221b", 4, "INO", 1995);
        Student student1 = new Student(2244, "Andrew", "Braytan avenue 12", 5, "Piano", 2003);
        Student student2 = new Student(2255, "Kris", "Wole street 233", 1, "Duhow", 2001);
        Student student3 = new Student(2266, "Amanda", "Wite house 88", 2, "Duhow", 1992);
        Student student4 = new Student(2277, "Kate", "Las vegas 1", 2, "Piano", 1996);
        Student student5 = new Student(2288, "Sam", "Saylant hill 234", 1, "INO", 1996);
        Student student6 = new Student(2299, "Jon", "Grant cannyon", 3, "Duhow", 1983);
        Student student7 = new Student(1166, "Matthew", "Pogranichnaya 10", 5, "INO", 1999);

        SortStudents sortStudents = new SortStudents();

        sortStudents.addStudents(student);
        sortStudents.addStudents(student1);
        sortStudents.addStudents(student2);
        sortStudents.addStudents(student3);
        sortStudents.addStudents(student4);
        sortStudents.addStudents(student5);
        sortStudents.addStudents(student6);
        sortStudents.addStudents(student7);


        for (Student s : sortStudents.listStudentsBornAfterGivenEar(1994)) {
            System.out.println(s.toString());
        }

    }
}
