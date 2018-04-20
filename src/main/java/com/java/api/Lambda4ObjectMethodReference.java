package com.java.api;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * 
 * 对象方法引用： 类名::instMethod (inst,args) -> 类名.instMethod(args)
 * 
 * 使用条件： 	A:抽象方法的第一个参数刚好是实例方法的类型 
 * 			B:抽象方法剩余的参数恰好可以当作实例方法的参数 必须满足以上条件，才可以使用对象方法的引用
 * 
 * @author Roger.Li
 */
public class Lambda4ObjectMethodReference {

	public static void main(String[] args) throws Exception{
		Consumer<String> stringConsumer = string -> string.toUpperCase();
		stringConsumer.accept("Lambda");

		Consumer<String> stringConsumer4ObjectMethodReference = String::toUpperCase;
		stringConsumer4ObjectMethodReference.accept("Lambda4ObjectMethodReference");

		BiConsumer<String, Integer> stringBiConsumer = (string, integer) -> string.charAt(integer);
		stringBiConsumer.accept("Lambda", 2);

		BiConsumer<String, Integer> stringBiConsumer4ObjectMethodReference = String::charAt;
		stringBiConsumer4ObjectMethodReference.accept("Lambda4ObjectMethodReference", 3);

		BiFunction<String, Integer, Character> stringBiFunction = (string, integer) -> string.charAt(integer);
		System.out.println("Lambda普通实现方式:" + stringBiFunction.apply("Lambda", 2));
		
		BiFunction<String, Integer, Character> stringBiFunction4ObjectMethodReference = String::charAt;
		System.out.println("Lambda方法的引用实现方式:" + stringBiFunction4ObjectMethodReference.apply("Lambda4ObjectMethodReference", 3));

		UseObjectMethodReference useObjectMethodReference = (useObjectMethod,source,location) -> new UseObjectMethod().getCharByLocation(source, location);
		System.out.println("Lambda普通实现方式:" + useObjectMethodReference.getCharByLocation(new UseObjectMethod(),"Lambda", 4));
		
		UseObjectMethodReference lambda4UseObjectMethodReference = UseObjectMethod::getCharByLocation;
		System.out.println("Lambda普通实现方式:" + lambda4UseObjectMethodReference.getCharByLocation(new UseObjectMethod(),"lambda4UseObjectMethodReference", 6));
		
	}
	
}

/**
 * 定义一个函数式接口
 * 		第一个参数: useObjectMethod
 * 		其他参数为: source,location
 * @author Roger.Li
 */
interface UseObjectMethodReference {
	Character getCharByLocation(UseObjectMethod useObjectMethod,String source,Integer location);
}

class UseObjectMethod {
	public Character getCharByLocation(String source,Integer location) {
		return source.charAt(location);
	}
}


