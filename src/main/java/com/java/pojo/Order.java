package com.java.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	private String orderCode;
	
	private String custNo;
	
	private String address;
}
