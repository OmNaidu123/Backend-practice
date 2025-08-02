package com.example.lomboktest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

@SuppressWarnings("ALL")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
public class TestModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String random;
}
