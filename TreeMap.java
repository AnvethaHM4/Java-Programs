//1. Write a Java program to traverse / iterate all the keys with the specified value in a TreeMap(1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”)
//[ hint : put() ; for (Map.Entry<Integer,String> entry : tree_map.entrySet()); getKey() and getValue()]
package lab2;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map< Integer,String> treeMap = new TreeMap<>();
		treeMap.put(1,"Apple");
		treeMap.put(2,"Strawberry");
		treeMap.put(3,"Pear");
		treeMap.put(4,"Cucumber");
		treeMap.put(5,"Grapes");
	
		System.out.println("Iterating over entries:");
		for (Entry<Integer, String> entry : treeMap.entrySet()) {
		System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}

//2. Write a Java program to search for keys C4 and C5 are present or not in the following Tree Map.("C1", "Red"); ("C2", "Green"); ("C3", "Black");("C4", "White")
package lab2;

import java.util.HashMap;
import java.util.*;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map< String,String> map1 = new TreeMap<>();
		map1.put( "c1", "Red");
		map1.put("c2", "Green");
		map1.put("c3", "Black");
		map1.put("c4", "White");
		
		System.out.println("Whehther it contains c4 or not: "+map1.containsKey("c4"));
		System.out.println("Whehther it contains c5 or not: "+map1.containsKey("c5"));

	}

}

//3. Remove the following all elements from the TreeMap then verify that its size is zero and include once again following elements and iterate them and check its size
//(1,”Banana”), (2,”Orange”), (3,”Guava”), (4,”Pomegranate ”), (5,”Amla”)[ Hint : clear() , size() and put()]
package lab2;

import java.util.HashMap;
import java.util.*;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map< String,String> map1 = new TreeMap<>();
		map1.put( "c1", "Red");
		map1.put("c2", "Green");
		map1.put("c3", "Black");
		map1.put("c4", "White");
		
		System.out.println("Whehther it contains c4 or not: "+map1.containsKey("c4"));
		System.out.println("Whehther it contains c5 or not: "+map1.containsKey("c5"));

	}

}

 //4. Write a Java program to get the first (lowest) key and the last (highest) key currently in the following Treemap.("C2", "Red"),("C1", "Green"), ("C4", "Black"), 
//("C3", "White")[ Hint : firstKey() and lastKey() ]
package lab2;

import java.util.*;
import java.util.TreeMap;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap< String,String> map1 = new TreeMap<>();
		map1.put( "c2", "Red");
		map1.put("c1", "Green");
		map1.put("c4", "Black");
		map1.put("c3", "White");
		System.out.println(map1);
		System.out.println("The first key is: "+map1.firstKey());
		System.out.println("The Last key is: "+map1.lastKey());

	}

}
