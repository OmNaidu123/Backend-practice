package com.example.javaJDBCexP.repo;

import com.example.javaJDBCexP.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepo {
    private JdbcTemplate jdbc;
    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired// hooks jdbc to a JdbcTemplate which is created and linked to the postgres data source
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    public void save(Student s){
        String query = "INSERT INTO student VALUES (?,?,?)";
        int rows = jdbc.update(query, s.getRollNo(), s.getName(), s.getMarks());
        // .update() executes a jdbc query
        System.out.println(rows + " effected");
    }
    public List<Student> findAll(){
        String query = "SELECT * FROM student";
        /*functional interface for .query() method,
        *  what this does is, for the result set returned by.query() method,
        *  it prepares a ArrayList of the type of data structure u want*/
        RowMapper<Student> smap = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s = new Student();
                s.setRollNo(rs.getInt("RollNo"));
                s.setName(rs.getString("Name"));
                s.setMarks(rs.getInt("Marks"));
                return s;
            }
        };
        //LAMBDA FUNCTION
//        RowMapper<Student> smap = (rs,rowNum)->{
//                Student s = new Student();
//                s.setRollNo(rs.getInt("RollNo"));
//                s.setName(rs.getString("Name"));
//                s.setMarks(rs.getInt("Marks"));
//                return s;
//        };
            return jdbc.query(query,smap); // this returns a ArrayList of students
    }
}
