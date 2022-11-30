package com.epam.training.student_matsvei_shablouski.classes.student_sort;



import java.util.List;

public interface SortMethods {
    List<Student> listStudentsByGivenFaculty(String faculty);
    List<Student> listStudentsForEachFacultyAndCourse();
    List<Student> listStudentsBornAfterGivenEar(int ear);
    List<Student> listStudyGroup();
}
