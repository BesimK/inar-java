package QA.week_10.assignments;

import QA.week_10.additionalClasses.Course;

public class Question_10_09 {
    public static void main(String[] args) {
        Course course = new Course("Java Class");
        course.addStudent("Sinan Cetin");
        course.addStudent("Besim Karabıyık");
        course.addStudent("Emir Uyanık");
        course.printStudents();
        System.out.println("----------------");
        course.dropStudent("Besim Karabıyık");
        course.printStudents();
        System.out.println("----------------");
    }
}