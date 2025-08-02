package com.telusko.springbootrest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.telusko.springbootrest.model.JobPost;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {
    @Query(value = "SELECT j FROM JobPost j WHERE j.postProfile LIKE %:postProfile% OR j.postDesc LIKE %:postDesc% OR :tech IN (SELECT unnest(j.postTechStack))")
    List<JobPost> findByKey(@Param("postProfile") String postProfile, @Param("postDesc") String postDesc, @Param("tech") String tech);










}
