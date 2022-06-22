package com.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
// Introduction to  Stream API
- These streams are related to Collection Framework(Group of objects). These streams are very different from io stream, io streams 
  are the sequence of data

- These streams are introduced in java  1.8 version.

- Stream API is basically perform bulk operations and process the objects of collection.

- Stream reduce the code length.

- Stream is an interface.


// With Stream  vs Without Stream comparison
*/

public class Stream_API {
	public static void main(String[] args) {
// Create  a list and Filter all the  even numbers from list	

		// List<Integer> list1 = List.of(2, 14, 50, 16, 25, 30 );

		// System.out.println(list1);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(21);
		list2.add(10);
		list2.add(15);
		list2.add(40);

		// System.out.println(list2);

		List<Integer> list3 = Arrays.asList(20, 25, 33, 34, 50);
		// System.out.println(list3);

		// Without stream
		List<Integer> listEven = new ArrayList<Integer>();

		for (Integer i : list3) {
			if (i % 2 == 0) {
				listEven.add(i);
			}
		}

		System.out.println(list3);
		System.out.println(listEven);

		// Using Stream
		// first way
		Stream<Integer> strm = list3.stream();
		List<Integer> newList = strm.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(newList);

		// or second way
		List<Integer> newList1 = list3.stream().filter(i -> i > 30).collect(Collectors.toList());
		System.out.println(newList1);

		// How to Create Stream Object
		// Stream API - collection process
		// collection/ group of object

		// 1). blank stream
		Stream<Object> emptystream = Stream.empty();
		emptystream.forEach(e -> {
			System.out.println(e);
		});

		// 2) Array, object, collection
		String names[] = { "Syed", "Tamzeed", "Ali", "Afwan" };
		Stream<String> stream1 = Stream.of(names);
		stream1.forEach(e -> {
			System.out.println(e);
		});

		// 3) Stream builder
		Stream<Object> streambuilder = Stream.builder().build();

		// 4) IntStream
		IntStream stream3 = Arrays.stream(new int[] { 2, 4, 6, 8 });
		stream3.forEach(e -> {
			System.out.println(e);
		});

		// 5) List, Set

		List<Integer> list4 = new ArrayList<Integer>();
		list4.add(21);
		list4.add(10);
		list4.add(15);
		list4.add(40);

		Stream<Integer> strm2 = list4.stream();
		strm2.forEach(e -> {
			System.out.println(e);
		});

		// Stream Operations important Stream Methods

		// filter(Predicate)
		// predicate is an interface which return boolean value function
		// e-> e>10
		// filter deal with boolean value

		// map(Function)
		// each element operation
		// map deal with element

		List<String> names1 = Arrays.asList("Ali", "Ankit ", "Ayush ", "Tamzeed ", "Afwan ");
		List<String> newNames = names1.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newNames);

		List<Integer> numbers01 = Arrays.asList(20, 4, 6, 9, 14, 15);
		List<Integer> newNumber = numbers01.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(newNumber);

		// for traverse
		names1.stream().forEach(e -> {
			System.out.println(e);
		});
        // or
		newNames.stream().forEach(System.out::println);

		// sort
		numbers01.stream().sorted().forEach(System.out::println);

		// Comparator
		Integer integer = numbers01.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println("Minimum " + integer);

		Integer integer2 = numbers01.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println("Maximum " + integer2);

	}
}
