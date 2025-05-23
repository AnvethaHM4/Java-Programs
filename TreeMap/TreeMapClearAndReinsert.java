//3. Remove the following all elements from the TreeMap then verify that its size is zero and include once again following elements and iterate them and check its size
//(1,”Banana”), (2,”Orange”), (3,”Guava”), (4,”Pomegranate ”), (5,”Amla”)[ Hint : clear() , size() and put()]
package lab2;

import java.util.HashMap;
import java.util.*;

public class TreeMapClearAndReinsert {

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
