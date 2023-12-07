package QA.week_11.assignments;

import QA.week_11.additionalClasses.Course;

public class Question_11_05 {
    public static void main(String[] args) {
        Course course = new Course("Inar Academy");
        course.addStudent("Nisanur Altuntaş");
        course.addStudent("Gürkan Serteser");
        course.addStudent("Sinan Çetin");
        course.addStudent("Mehmet Toprak");
        course.addStudent("Sefa Atakul");
        course.addStudent("Musa Deniz");
        course.addStudent("Berkan Eriş");
        System.out.println("After adding students to the course...");
        System.out.println(course.getStudents().toString());
        System.out.println("Number of students: " + course.getNumberOfStudents());
        System.out.println("----------------------------------------");
        course.dropStudent("Sinan Çetin");
        course.dropStudent("Musa Deniz");
        course.dropStudent("Berkan Eriş");
        System.out.println("After dropping students from the course...");
        System.out.println(course.getStudents().toString());
        System.out.println("Number of students: " + course.getNumberOfStudents());
    }
}
