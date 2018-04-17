package com.java.business;
/**
 * 
 * 只有一个抽象方法的接口，才是函数式接口
 * 如果可以加注解 @FunctionalInterface 则证明该接口是一个函数式接口
 * 
 * 如果只有一个 default 方法不是函数式接口了
 * 如果只有一个    static 方法也不是函数式接口
 *
 */
@FunctionalInterface
public interface UserMapper {
	int insert();
}
