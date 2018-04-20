package com.java.api;

import java.util.function.Supplier;

public class Lambda4Suppiler {

	public static void main(String[] args) {
		Supplier<String> lambda4Supplier = () -> "代表一个输出";
		
		System.out.println(lambda4Supplier.get());
	}
}
