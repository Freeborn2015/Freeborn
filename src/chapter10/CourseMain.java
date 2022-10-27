package chapter10;

public class CourseMain {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Data System");

        course1.addStudent("Chris Egbenum");
        course1.addStudent("Fresh Ejiro");
        course1.addStudent("Emmanuel Ojo");

        course1.dropStudent("Fresh Ejiro");


        course2.addStudent("Elisha Agba");
        course2.addStudent("Emeni Dorcas");

        System.out.println("Number of student in course1: " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for(int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.println(students[i]);
        System.out.println();

        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());




    }

}
