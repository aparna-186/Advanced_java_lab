package com.srkr;

public class Student {
    private final int id;
    private final String name;
    private final Course course;

    public Student(int id,String name,Course course)
    {
        this.id=id;
        this.name=name;
        this.course=course;
    }

        public void display()
        {
            System.out.println("Student ID: "+id);
            System.out.println("Student Name: "+name);
            course.displayCourse();
         }

}
