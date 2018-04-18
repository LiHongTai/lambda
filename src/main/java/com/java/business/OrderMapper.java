package com.java.business;

import com.java.pojo.Order;

@FunctionalInterface
public interface OrderMapper {
	int insert(Order order);
}
