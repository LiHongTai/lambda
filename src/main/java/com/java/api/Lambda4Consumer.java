package com.java.api;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Lambda4Consumer {

	public static void main(String[] args) {
		Consumer<String> lambda4Consumer = input -> System.out.println("消费一个输入:" + input);
		lambda4Consumer.accept("consumer");
		
		BiConsumer<Integer, Integer> lambda4BiConsumer = (a,b) -> System.out.println("两个输入之和:"+ (a + b));
		lambda4BiConsumer.accept(10, 20);
	}
}
