package com.java._8;

public interface P2_Interface {

	static void testStaticMethod() {
		System.out.println("P2_Interface 接口static方法调用");
	}
	
	default void testDefaultMethod() {
		System.out.println("P2_Interface 接口default方法调用");
	}
}
