package com.medium.myapplication;

public class Student {
    private String studentName,studentBirthDate,studentClass;

    public Student(String studentName, String studentBirthDate, String studentClass) {
        this.studentName = studentName;
        this.studentBirthDate = studentBirthDate;
        this.studentClass = studentClass;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentBirthDate() {
        return studentBirthDate;
    }

    public void setStudentBirthDate(String studentBirthDate) {
        this.studentBirthDate = studentBirthDate;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
}
