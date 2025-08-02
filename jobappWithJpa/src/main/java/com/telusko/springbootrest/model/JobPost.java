package com.telusko.springbootrest.model;


import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("ALL")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
public class JobPost {
	@Id
	private int postId;
	private String postProfile; 
	private String postDesc;
	private Integer reqExperience;
	private List<String> postTechStack;
	

}
