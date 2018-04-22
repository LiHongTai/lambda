package com.java.stream.utils;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamUtil {

	public static <T> Stream<T> arrayToStream(T[] array){
		return (Stream<T>) Stream.of(array);
	}
	
	public static <T> Stream<T> listToStream(List<T> list){
		return list.stream();
	}
	
	public static <T> Stream<T> generate(T arg){
		Supplier<T> supplier = () -> arg;
		return Stream.generate(supplier);
	}
	
}
