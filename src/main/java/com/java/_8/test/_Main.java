package com.java._8.test;

import com.java._8.C1_Interface;
import com.java._8.impl.C1_InterfaceImpl;

public class _Main {

	public static void main(String[] args) {

		// 静态变量被继承
		System.out.println(C1_Interface.P1_VAR);

		C1_Interface c1_Interface = new C1_InterfaceImpl();
		// 默认方法的调用
		c1_Interface.testDefaultMethod();
	}
}
