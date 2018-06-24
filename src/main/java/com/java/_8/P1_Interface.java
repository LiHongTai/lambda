package com.java._8;

public interface P1_Interface {

	public static String P1_VAR = "P1StaticVariable";
	
	static void testStaticMethod() {
		System.out.println("P1_Interface 接口static方法调用");
	}
	
	default void testDefaultMethod() {
		System.out.println("P1_Interface 接口default方法调用");
	}
}
