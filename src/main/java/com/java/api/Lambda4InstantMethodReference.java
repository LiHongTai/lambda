package com.java.api;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lambda4InstantMethodReference {

	public static void main(String[] args) {
		//沒有输入，只有输出
		Supplier<String> string4Supplier = () -> new Lambda4InstantMethodReference().get();
		System.out.println("一般方式Lambda表达式：" + string4Supplier.get());

		// 静态方法的引用实现
		Supplier<String> stringSupplier4InstantMehtodReference = new Lambda4InstantMethodReference()::get;
		System.out.println("实例方法的引用来实现Lambda表达式:" + stringSupplier4InstantMehtodReference.get());
		
		//只有输入，没有输出
		Consumer<String> string4Consumer = string -> new Lambda4InstantMethodReference().set(string);
		string4Consumer.accept("一般方式Lambda表达式实现");
		
		Consumer<String> stringConsumer4InstantMehtodReference = new Lambda4InstantMethodReference()::set;
		stringConsumer4InstantMehtodReference.accept("实例方法引用方法Lambda表达式实现");
		
	}

	public String get() {
		return "恰好通过调用一个实例方法实现";
	}

	public void set(String args) {
		System.out.println("传入的参数为:" + args);
	}
}
