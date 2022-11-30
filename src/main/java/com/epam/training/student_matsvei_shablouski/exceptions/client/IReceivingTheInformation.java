package com.epam.training.student_matsvei_shablouski.exceptions.client;
import com.epam.training.student_matsvei_shablouski.exceptions.constants.Subject;
import com.epam.training.student_matsvei_shablouski.exceptions.univer.Faculty;
import com.epam.training.student_matsvei_shablouski.exceptions.univer.Group;
import com.epam.training.student_matsvei_shablouski.exceptions.univer.Student;
import com.epam.training.student_matsvei_shablouski.exceptions.univer.University;

public interface IReceivingTheInformation {

    double getAverageGradByAllSubjectsSpecificStudent(Student student);
    double getAverageGradeBySpecificSubjectGroupFaculty(Faculty faculty, Group group, Subject subject);
    double getAverageGradeBySubjectAllUniversity(University university, Subject subject);
}
