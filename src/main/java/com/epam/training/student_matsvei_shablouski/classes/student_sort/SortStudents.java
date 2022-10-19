package com.epam.training.student_matsvei_shablouski.classes.student_sort;




import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortStudents implements SortMethods {

    private List<Student> studentList;

    public SortStudents() {
        studentList = new ArrayList<>();
    }

    public void addStudents(Student student) {
        studentList.add(student);
    }

    @Override
    public List<Student> listStudentsByGivenFaculty(String faculty) {
        for (Student student : studentList) {
            if (student.getFaculty() == faculty)
                System.out.println(student.toString());
        }
        return studentList;
    }

    @Override
    public List<Student> listStudentsForEachFacultyAndCourse() {
//1
        studentList.sort(Comparator.comparing(Student :: getFaculty).thenComparing(Student :: getCurs));

//2
//        Collections.sort(studentList, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                int resultFac = o1.getFaculty().compareTo(o2.getFaculty());
//                if (resultFac == 0) {
//                    return o1.getCurs() - o2.getCurs();
//                }
//                return resultFac;
//            }
//        });

//3
//        Comparator<Student> comparator = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                int result = o1.getFaculty().compareTo(o2.getFaculty());
//                if (result == 0) {
//                    return o1.getCurs() - o2.getCurs();
//                }
//                return result;
//            }
//        };
//        Collections.sort(studentList, comparator);
        return studentList;
    }

    @Override
    public List<Student> listStudentsBornAfterGivenEar(int ear) {
        studentList.removeIf(s -> s.getBirthday() < ear);
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getBirthday() - o2.getBirthday();
            }
        });
        return studentList;
    }

    @Override
    public List<Student> listStudyGroup() {
        return null;
    }
}
