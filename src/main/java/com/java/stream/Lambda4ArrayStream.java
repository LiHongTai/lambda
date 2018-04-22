package com.java.stream;

import java.util.stream.Stream;

import com.java.stream.utils.StreamUtil;

public class Lambda4ArrayStream {

	public static void main(String[] args) {
		String[] stringArray = new String[] { "1", "q", "2", "w" };

		Stream<String> stringStream = StreamUtil.arrayToStream(stringArray);
	
		stringStream.sorted().forEach(System.out::println);
		
	}
}
