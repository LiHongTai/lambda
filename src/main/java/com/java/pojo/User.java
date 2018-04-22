package com.java.pojo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private String name;

	private Integer age;

	private String sex;
	
	private LocalDate birthDate;
	
}
