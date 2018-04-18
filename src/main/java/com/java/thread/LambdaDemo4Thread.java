package com.java.thread;

import java.util.concurrent.Callable;

public class LambdaDemo4Thread {

	public static void main(String[] args) throws Exception {
		
		//无参数，无返回值
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("线程1开始执行....");
			}
		};
		r1.run();
		
		Runnable lambdaRunnbale = () -> System.out.println("线程1开始执行....");
		lambdaRunnbale.run();
		
		//无参，有返回值
		Callable<String> c1 = new Callable<String>() {
			@Override
			public String call() throws Exception {
				return "不使用Lambda实现的";
			}
		};
		System.out.println(c1.call());
		
		Callable<String> lambdaCallable = () -> "使用Lambda实现的";
		System.out.println(lambdaCallable.call());
	}
}
