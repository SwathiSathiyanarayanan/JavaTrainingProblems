package com.wissen.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Features {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("ankit");
		list.add("mayank");
		list.add("irfan");
		list.add("jai");

		// for each
		list.forEach(n -> System.out.println(n));

		// Lambda Expression Comparator
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "HP Laptop", 25000f));
		productList.add(new Product(3, "Keyboard", 300f));
		productList.add(new Product(2, "Dell Mouse", 150f));

		Collections.sort(productList, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});
		productList.forEach(n -> System.out.println(n.name));

		// Lambda Function Filter

		List<Product> list1 = new ArrayList<Product>();
		list1.add(new Product(1, "Samsung A5", 17000f));
		list1.add(new Product(3, "Iphone 6S", 65000f));
		list1.add(new Product(2, "Sony Xperia", 25000f));
		list1.add(new Product(4, "Nokia Lumia", 15000f));
		list1.add(new Product(5, "Redmi4 ", 26000f));
		list1.add(new Product(6, "Lenevo Vibe", 19000f));

		Stream<Product> streamProduct = list1.stream().filter(p -> p.price > 20000);

		streamProduct.forEach(s -> System.out.println(s.price));

		// Stream API
		List<Integer> number = Arrays.asList(2, 3, 4, 2);
		number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

		// create a list of String
		List<String> names = Arrays.asList("Reflection", "Collection", "Stream", "Swathi");

		// demonstration of reduce method
		int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
		System.out.println("Even" + even);

		// demonstration of filter method
		List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		result.forEach(r -> System.out.println(r));
		System.out.println("Sorting on the basis of name...");
	}

}
