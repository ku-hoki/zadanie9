package org.example;

public class Student extends Human{
    private String university;
    private String faculty;
    private String specialty;

    public Student(String surname, String name, String middlename, int age, Gender gender, String university, String faculty, String specialty) {
        super(surname, name, middlename, age, gender);
        this.university = university;
        this.faculty = faculty;
        this.specialty = specialty;
    }
}
