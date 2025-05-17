//1. Write a Java program to traverse / iterate all the keys with  the specified value in a HashMap (1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”)
import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

public class P1 {
	public static void main(String[] args) {
		HashMap< Integer,String> hashMap = new HashMap<>();
		hashMap.put(1,"Apple");
		hashMap.put(2,"Strawberry");
		hashMap.put(3,"Pear");
		hashMap.put(4,"Cucumber");
		hashMap.put(5,"Grapes");
	
		System.out.println("Iterating over entries:");
		for (Entry<Integer, String> entry : hashMap.entrySet()) {
		System.out.println("Key: "+entry.getKey() + " -> Value: " + entry.getValue());
		}
		}
	}


//2.Remove the following all elements from the HashMap then verify that its size is zero and include once again following elements and check its size
//(1,”Banana”), (2,”Orange”), (3,”Guava”), (4,”Pomegranate ”), (5,”Amla”) [ Hint : clear() , size() and put()]
import java.util.HashMap;
import java.util.Map;
public class P2 {
	public static void main(String[] args) {
		Map< Integer,String> hashMap = new HashMap<>();
		// 1. Basic Operations
		// Adding elements
		hashMap.put(1,"Apple");
		hashMap.put(2,"Strawberry");
		hashMap.put(3,"Pear");
		hashMap.put(4,"Cucumber");
		hashMap.put(5,"Grapes");
		hashMap.clear();
		System.out.println("After removing All elements size : "+hashMap.size());
		hashMap.put(1,"Apple");
		hashMap.put(2,"Strawberry");
		hashMap.put(3,"Pear");
		hashMap.put(4,"Cucumber");
		hashMap.put(5,"Grapes");
		System.out.println("After Adding All elements size : "+hashMap.size());
	}

}


//3.Write a Java program to copy all mappings from the specified map to another map as shown below Hashmap1 => ( 1, "Red") ,(2, "Green"), (3, "Black")
//Hashmap2 => (4, "White"),(5, "Blue"),(6, "Orange")Add all the values of Hashmap1 intoLiberation Serif Hashmap2 and print the result
package lab2;

import java.util.HashMap;
import java.util.Map;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map< Integer,String> map1 = new HashMap<>();
		map1.put( 1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		// Merging maps
		Map<Integer,String> map2 = new HashMap<>();
		map2.put(4, "White");
		map2.put(5, "Blue");
		map2.put(6, "Orange");
		map2.forEach((key, value) ->
		map1.merge(key, value, (v1, v2) -> v1 + v2));
		System.out.println("After merging maps: " + map1);
	}

}


//4.Write a Java program to check whether a map contains Key-Values mappings (empty) or not after adding all the following elements into Hashmap and after 
//removing all the elements from the Hashmap.(1, "Red"),(2, "Green"), (3, "Black"), (4, "White"),(5, "Blue")
package lab2;

import java.util.HashMap;
import java.util.Map;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map< Integer,String> map1 = new HashMap<>();
		map1.put( 1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		map1.put(4, "White");
		boolean res=map1.isEmpty();
		System.out.println("Before Removing: "+res);
		map1.clear();
		
		res=map1.isEmpty();
		System.out.println("After removing: "+res);

	}

}
