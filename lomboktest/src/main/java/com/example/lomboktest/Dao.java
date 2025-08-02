package com.example.lomboktest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao extends JpaRepository<TestModel, Integer> {
}
