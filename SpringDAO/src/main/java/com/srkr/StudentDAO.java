package com.srkr;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {

    private final JdbcTemplate jdbcTemplate;

    public StudentDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // INSERT
    public void insertStudent(Student student) {

        String sql =
                "INSERT INTO student(sid, name, branch) VALUES (?, ?, ?)";

        jdbcTemplate.update(
                sql,
                student.getSid(),
                student.getName(),
                student.getBranch()
        );

        System.out.println("Student inserted successfully");
    }

    // SELECT
    public void displayStudents() {

        String sql = "SELECT * FROM student";

        jdbcTemplate.query(sql, rs -> {

            System.out.println(
                    rs.getInt("sid") + " " +
                            rs.getString("name") + " " +
                            rs.getString("branch")
            );
        });
    }

    // UPDATE
    public void updateStudent(int sid, String branch) {

        String sql =
                "UPDATE student SET branch = ? WHERE sid = ?";

        jdbcTemplate.update(sql, branch, sid);

        System.out.println("Student updated successfully");
    }

    // DELETE
    public void deleteStudent(int sid) {

        String sql =
                "DELETE FROM student WHERE sid = ?";

        jdbcTemplate.update(sql, sid);

        System.out.println("Student deleted successfully");
    }
}
