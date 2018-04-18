package com.java.api;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaDemo4Function {

	public static void main(String[] args) {
		// 一个输入，一个输出
		Function<Integer, Integer> lambda4Function = input -> {
			Integer sum = 0;
			for (int i = 1; i <= input; i++) {
				sum = sum + i;
			}
			return sum;
		};

		System.out.println(lambda4Function.apply(10));

		// 两个输入，一个输出
		BiFunction<Integer, Integer, String> lambda4BiFunction = (a, b) -> "求和" + (a + b);
		System.out.println(lambda4BiFunction.apply(10, 20));
	}
}
