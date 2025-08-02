package com.example.loginProject.repo;

import com.example.loginProject.models.User;
import com.example.loginProject.models.Video;
import com.example.loginProject.models.Videos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class repository {
    private JdbcTemplate jdbc;
    private Videos videos;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public boolean insertVid(Video vid) {
        String sql = "INSERT INTO uservids VALUES (?,?)";
        int effected = jdbc.update(sql, vid.getUsername(), vid.getVidURL());
        return effected == 1;
    }

    public ArrayList<String> getVids(User user) {
        String sql = "SELECT * FROM uservids WHERE username = ?";
        RowMapper<String> vmap = (rs, rowNum) -> {
            return rs.getString("video");
        };
        ArrayList<String> videos = null;
        try {
            videos = (ArrayList<String>) jdbc.query(sql, vmap, user.getUsername());
        } catch (Exception e) {
            System.err.println("Database query error: " + e.getMessage());
            return null;
        }
        return videos;
    }

    public boolean checkIfExists(User user) {
        String sql = "SELECT * FROM users WHERE username = ?";
        RowMapper<User> smap = (rs, rowNum) -> {
            User u = new User();
            u.setUsername(rs.getString("username"));
            u.setPassword(rs.getString("password"));
            return u;
        };
        try {
            List<User> verifying = jdbc.query(sql, smap, user.getUsername());
            if (verifying.isEmpty()) {
                return false;
            }
            return verifying.get(0).getPassword().equals(user.getPassword());
        } catch (Exception e) {
            System.err.println("Database query error: " + e.getMessage());
            return false;
        }
    }

    public boolean insert(User user) {
        String sql = "INSERT INTO users VALUES (?,?)";
        try {
            int effected = jdbc.update(sql, user.getUsername(), user.getPassword());
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }
}

