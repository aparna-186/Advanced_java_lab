package com.srkr;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentDAO dao;

    public StudentService(StudentDAO dao) {
        this.dao = dao;
    }

    public void addStudent(Student student) {

        dao.insertStudent(student);
    }

    public void showStudents() {

        dao.displayStudents();
    }

    public void changeBranch(int sid, String branch) {

        dao.updateStudent(sid, branch);
    }

    public void removeStudent(int sid) {

        dao.deleteStudent(sid);
    }
}
