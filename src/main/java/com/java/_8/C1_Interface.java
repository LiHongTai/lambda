package com.java._8;

/**
 * 静态方法不被继承
 * @author Roger.Li
 */
public interface C1_Interface extends P1_Interface, P2_Interface {
	
	public static String P2_VAR = "P2StaticVariable";
	
	/**
	 * 重写多个父类相同的default方法，不然会报错
	 */
	default void testDefaultMethod() {
		P1_Interface.super.testDefaultMethod();
		P2_Interface.super.testDefaultMethod();
	}
}
