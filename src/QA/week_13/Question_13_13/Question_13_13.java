package QA.week_13.Question_13_13;

public class Question_13_13 {
    public static void main(String[] args) {
        Course course1 = new Course("Inar Academy");
        course1.addStudent("Burak");
        course1.addStudent("Emre");
        course1.addStudent("Furkan");
        course1.addStudent("Jack");
        Course course2 = course1.clone();
        course2.addStudent("Jonny");
        course2.addStudent("Tonny");
        System.out.println("Number of students in course1 -> " + course1.getNumberOfStudents());
        for (String name: course1.getStudents()) {
            System.out.print(name + " " );
        }
        System.out.println("\n---------------------------------------------------------------------------");
        System.out.println("Number of students in course2 -> " + course2.getNumberOfStudents());
        for (String name: course2.getStudents()) {
            System.out.print(name + " " );
        }
    }
}
