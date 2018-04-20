package com.java.api;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * 构造方法的引用
 * 		类名::new				(args) -> new 类名(args)
 * @author Roger.Li
 */
public class Lambda4ConstruMethodReference {

	public static void main(String[] args) {
		//沒有输入，只有输出
		Supplier<Person> supplier = () -> new Person();
		System.out.println("复杂Lambda表达式：" + supplier.get());

		// 构造方法的引用实现
		Supplier<Person> stringSupplier4ConstruMehtodReference = Person::new;
		System.out.println("通过构造方法的引用来实现Lambda表达式:" + stringSupplier4ConstruMehtodReference.get());
		
		Consumer<String> stringConsumer = accountCode -> new Account(accountCode);
		stringConsumer.accept("Lambda一般实现方式");
		
		Consumer<String> stringConsumer4ConstruMehtodReference = Account::new;
		stringConsumer4ConstruMehtodReference.accept("Lambda构造方法的引用方式实现");
	}
}

class Person{
	
}

class Account{
	public Account(String accountCode){
		 
	}
}
