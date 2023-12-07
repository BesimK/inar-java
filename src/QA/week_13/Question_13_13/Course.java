package QA.week_13.Question_13_13;

import java.util.ArrayList;

public class Course implements Cloneable{
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

    @Override
    public Course clone()  {
        try {
            Course clone = (Course) super.clone();
            clone.students = new ArrayList<>(students);
            return clone;
        }catch (CloneNotSupportedException ex){
            return new Course("Error");
        }
    }
}