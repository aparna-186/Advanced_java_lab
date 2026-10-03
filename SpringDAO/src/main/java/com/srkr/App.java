package com.srkr;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService service =
                context.getBean(StudentService.class);

        // INSERT
        Student s1 =
                new Student(206, "Rahul12", "CSE");
        service.addStudent(s1);

        Student s2 =
                new Student(202, "Anitha12", "IT");

        service.addStudent(s2);

        // DISPLAY
        System.out.println("\nStudents:");

        service.showStudents();
    }
}
