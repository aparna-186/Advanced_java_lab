package com.srkr;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private Course course;

    @Autowired
    public Student(Course course) {
        this.course = course;
        System.out.println("Student Bean Created");
    }

    public void displayStudent() {

        System.out.println("Student Name : Rahul");
        course.displayCourse();

    }

}
