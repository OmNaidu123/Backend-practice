package com.example.database_rendering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MainRepo {
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    //database automatic polling logic
    // Polling interval (5 seconds)
    @Scheduled(fixedRate = 5000)
    public void pollDatabase() {
        String sql = "SELECT * FROM orders WHERE last_updated > now() - interval '5 seconds'";// Check for recent changes
        RowMapper<Order> smap = (rs, rowNum) -> {
            Order order = new Order();
            order.setOrder_id(rs.getInt("order_id"));
            order.setName(rs.getString("order_name"));
            order.setLast_updated(String.valueOf(rs.getDate("last_updated")));
            return order;
        };
        List<Order> changed;
        try {
            changed = jdbc.query(sql, smap); // Check if there are any changes
            if (!changed.isEmpty()) {
                // Trigger WebSocket or other logic here when changes are detected
                for(Order order: changed)
                    System.out.println("order id: "+order.getOrder_id());
                // Here you can invoke a WebSocket controller or any other action
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
