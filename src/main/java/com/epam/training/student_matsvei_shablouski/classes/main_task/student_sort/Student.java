package com.epam.training.student_matsvei_shablouski.classes.student_sort;

public class Student {
    private int id;
    private String name;
    private String surname;
    private int birthday;
    private String address;
    private int numberPhone;
    private String faculty;
    private int curs;
    private String group;

    public Student(){};

    public Student(String name) {
        this.name = name;
    }

    public Student(int id, String name, String address, int curs, String faculty, int birthday) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.curs = curs;
        this.faculty = faculty;
        this.birthday = birthday;
    }

    public Student(int id, String name, int curs) {
        this.id = id;
        this.name = name;
        this.curs = curs;
    }


    public Student(int id, String name, String surname, int birthday, String address, int numberPhone, String faculty, int curs, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.address = address;
        this.numberPhone = numberPhone;
        this.faculty = faculty;
        this.curs = curs;
        this.group = group;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {this.id = id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
