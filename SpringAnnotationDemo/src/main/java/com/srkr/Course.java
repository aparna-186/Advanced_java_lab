package com.srkr;
import org.springframework.stereotype.Component;

@Component
public class Course {

    public Course() {
        System.out.println("Course Bean Created");
    }

    public void displayCourse() {
        System.out.println("Course Name : Spring Framework");
    }
}
