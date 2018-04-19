package com.java.api;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaDemo4StaticMethodReference {

	public static void main(String[] args) {
		//沒有输入，只有输出
		Supplier<String> string4Supplier = () -> LambdaDemo4StaticMethodReference.get();
		System.out.println("复杂Lambda表达式：" + string4Supplier.get());

		// 静态方法的引用实现
		Supplier<String> stringSupplier4StaticMehtodReference = LambdaDemo4StaticMethodReference::get;
		System.out.println("通过方法的引用来实现Lambda表达式:" + stringSupplier4StaticMehtodReference.get());
		
		//只有输入，没有输出
		Consumer<String> string4Consumer = string -> LambdaDemo4StaticMethodReference.set(string);
		string4Consumer.accept("一般方式Lambda表达式实现");
		
		Consumer<String> stringConsumer4StaticMehtodReference = LambdaDemo4StaticMethodReference::set;
		stringConsumer4StaticMehtodReference.accept("静态方法引用方法Lambda表达式实现");
		
	}

	public static String get() {
		return "恰好通过调用一个静态方法实现";
	}

	public static void set(String args) {
		System.out.println("传入的参数为:" + args);
	}
}
