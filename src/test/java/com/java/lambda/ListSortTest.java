package com.java.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;

public class ListSortTest extends TestCase {

	@Test
	public void testListSort() {
		List<String> bookList = Arrays.asList("websphere", "nginx","weblogic","tomcat");
		
		//java 1.8 之前
		Collections.sort(bookList, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});
		System.out.println("*******使用lambda表达式之前*******");
		bookList.forEach((a) -> System.out.println(a));
		
		// 自动推断参数类型
		// 代码简洁
		Collections.sort(bookList,(o1,o2) -> o2.compareTo(o1) );
		System.out.println("*******使用lambda表达式之后*******");
		bookList.forEach((a) -> System.out.println(a));
	}
}
