//1. Write a Java program to traverse / iterate all the keys with the specified value in a linked HashMap (1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”)
//and display only elderly entered 4 elements only [ hint : Refer to 5. LinkedHashMap Demonstration of worked out example]
package Collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n=== LinkedHashMap Demonstration ===");
        Map<Integer,String> Map = new LinkedHashMap<>() {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer,String> eldest) {
                return size() > 4; // Remove eldest entry if size exceeds 4
            }
        };
		Map.put(1,"Apple");
		Map.put(2,"Strawberry");
		Map.put(3,"Pear");
		Map.put(4,"Cucumber");
		Map.put(5,"Grapes");
		System.out.println("Iterating over entries:");
		for (Entry<Integer, String> entry : Map.entrySet()) {
		System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		System.out.println("Elderly entries(To display only 4 elements):");
		System.out.println("After adding 5 (notice removal of eldest): " + Map);	
		}
	}

//2. Include the following elements into the LinkedHashMap called programminglanguages and print all of them.("Java", 1995);("Python", 1991);(“JavaScript", 1995);("C++", 1985);
package lab2;

import java.util.*;
import java.util.TreeMap;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> programminglanguages = new LinkedHashMap<>();
		programminglanguages.put("Java", 1995);
		programminglanguages.put("Python", 1991);
		programminglanguages.put("JavaScript", 1995);
		programminglanguages.put("C++", 1985);
		System.out.println(programminglanguages);
	}

}

//3. Include the following elements into the LinkedHashMap called programminglanguages and print as follows.
//Java was developed in 1995
//Python was developed in 1991.
//JavaScript was developed in 1995
//C++ was developed in 1985
package lab2;

import java.util.LinkedHashMap;
import java.util.*;
import java.util.Map.Entry;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> programminglanguages = new LinkedHashMap<>();
		programminglanguages.put("Java", 1995);
		programminglanguages.put("Python", 1991);
		programminglanguages.put("JavaScript", 1995);
		programminglanguages.put("C++", 1985);
		for (Entry< String,Integer> entry : programminglanguages.entrySet()) {
			System.out.println(entry.getKey() + " was developed in " + entry.getValue());
			}
	}

}

//4. Add elements in the same order in the LinkedHaspMap using for() loop and put()
//String[] keys = {"C", "A", "B", "E", "D"};
//Integer[] values = {3, 1, 2, 5, 4};
package lab2;

import java.util.LinkedHashMap;
import java.util.Map;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] keys = {"C", "A", "B", "E", "D"};
		Integer[] values = {3, 1, 2, 5, 4};
		Map<String,Integer> lMap = new LinkedHashMap<>();
		for(int i=0;i<keys.length;i++) {
			lMap.put(keys[i], values[i]);
		}
		System.out.println(lMap);

	}

}
