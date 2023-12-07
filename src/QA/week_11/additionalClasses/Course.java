package QA.week_11.additionalClasses;

import java.util.ArrayList;

public class Course {
    private final String courseName;
    private ArrayList<String> students = new ArrayList<>() ;


    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return students.toArray().length;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
    }
}