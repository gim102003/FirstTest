package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstTest {

	public static <T> void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("aew");
		list.add("agd");
		list.add("asa");
		list.add("gja");

		for (String string : list) {
			if (string.equals("aaa")) {
				System.out.println(string);
			}
		}

		list.stream().filter(t -> t.equals("aaa")).forEach(t -> System.out.println(">>>> " + t));
		;

		String[] name = { "a", "b" };
		Arrays.sort(name, (o1, o2) -> o1.compareTo(o2));
	}
}
