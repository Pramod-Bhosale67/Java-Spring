package com.codegreedy.SpringJDBC.repo;

import com.codegreedy.SpringJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbc;

    public JdbcTemplate jdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student stud){
        // to add into the database we, need a query.
        // so we have insert, update and execute query

        String sql = "insert into student (roll, Name, Marks) values (?, ?, ?)";

        int effect = jdbc.update(sql, stud.rollNo(), stud.name(), stud.marks());
        System.out.println("Added to the database & effected row : " + effect);
    }

    public List<Student> findAll(){
        String sql = "select * from student";

//        RowMapper <Student> rowMapper = new RowMapper<Student>() {
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//                Student stud = new Student();
//                stud.setRollNo(rs.getInt("roll"));
//                stud.setName(rs.getString("name"));
//                stud.setMarks(rs.getInt("marks"));
//
//                return stud;
//            }
//        };

        RowMapper <Student> rowMapper = (ResultSet rs, int rowNum) -> {
                Student stud = new Student();
                stud.setRollNo(rs.getInt("roll"));
                stud.setName(rs.getString("name"));
                stud.setMarks(rs.getInt("marks"));

                return stud;
        };

        return jdbc.query(sql, rowMapper);
    }

}
