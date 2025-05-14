//1.Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not
import java.util.*;
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		System.out.println(ls);
		if(ls.contains("red")) {
			System.out.println("available");
		}else {
			System.out.println("available not");
		}
	}

}

//2.Write a java program for getting different colors through ArrayList interface and remove the 2nd element and color "Blue" from the ArrayList
import java.util.*;
public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		System.out.println(ls);
		ls.remove(2);
		System.out.println(ls);
		ls.remove("Blue");
		System.out.println(ls);
	}

}

//3.Write a java program for getting different colors through ArrayList interface and sort them using Collections.sort( ArrayListObj)
import java.util.*;
public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		System.out.println("Before sorting:");
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println("After sorting:");
		System.out.println(ls);
	}

}

//4.Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object by using SubList()
import java.util.*;
public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		System.out.println(ls);
		System.out.println("using sublist:");
		System.out.println(ls.subList(0,2));
	}

}

//5.Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index
import java.util.*;
public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("green");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
    int n=3;
		String Str="green";
		System.out.println(ls);
		System.out.println("Removing the nth Element:"+ls.remove(Str));
		System.out.println(ls);
	}

}

