package com.java.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import com.java.pojo.User;
import com.java.stream.utils.StreamUtil;

public class LambdaTest {

	@Test
	public void validateHttpGetRequest() {

		String httpReqString = "itemId=1&userId=1000&type=20";
		Map<String, String> httpReqParam = Stream.of(httpReqString.split("&")).map(string -> string.split("="))
				.collect(Collectors.toMap(string -> string[0], string -> string[1]));

		httpReqParam.forEach((key, value) -> {
			System.out.println("键值：" + key + ",值：" + value);
		});
	}

	@Test
	public void shouldListToStream() {
		Stream<User> userStreams = StreamUtil.listToStream(getUsers());

		List<Integer> ageList = userStreams.map(book -> book.getAge()).collect(Collectors.toList());
		ageList.forEach(System.out::println);

		String nameString = StreamUtil.listToStream(getUsers()).map(user -> user.getName())
				.collect(Collectors.joining(",", "(", ")"));
		System.out.println(nameString);
	}

	@Test
	public void shouldListToMap() {
		Stream<User> userStreams = StreamUtil.listToStream(getUsers());
		Map<String, User> userMap = userStreams.collect(Collectors.toMap(User::getName, user -> user));
		userMap.forEach((key, value) -> System.out.println("键值：" + key + ",值：" + value));
	}

	@Test
	public void shouldAgeAverage() {
		Stream<User> userStreams = StreamUtil.listToStream(getUsers());
		Double ageAverage = userStreams.collect(Collectors.averagingDouble(User::getAge));
		System.out.println("平均年龄:" + ageAverage);
	}

	@Test
	public void shoulAgeMax() {
		Stream<User> userStreams = StreamUtil.listToStream(getUsers());
		Optional<User> ageMaxUser = userStreams.collect(Collectors.maxBy(Comparator.comparing(User::getAge)));
		System.out.println("年龄最大的用户:" + ageMaxUser.get());
	}

	private List<User> getUsers() {
		List<User> users = new ArrayList<>();
		users.add(new User("Roger", 21, "M", LocalDate.parse("1997-02-15")));
		users.add(new User("Mary", 20, "F", LocalDate.parse("1998-03-18")));
		users.add(new User("Jim", 26, "M", LocalDate.parse("1992-02-15")));
		users.add(new User("James", 30, "M", LocalDate.parse("1988-05-17")));
		users.add(new User("Jack", 21, "M", LocalDate.parse("1997-07-10")));
		return users;
	}
}
