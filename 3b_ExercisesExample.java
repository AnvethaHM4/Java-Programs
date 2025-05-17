**String**
//1. Question: Given a string, write a method to determine if it is a palindrome (reads the sameforward and backward), ignoring case and non-alphanumeric characters.
//Input: "A man, a plan,a canal: Panama"
//Output: true Input: "race a car"
//Output: false
  public class PalindromeChecker {

    public static boolean isPalindrome(String s) {
        if (s == null) return false;

        // Use StringBuilder to store cleaned characters
        StringBuilder cleaned = new StringBuilder();
        
        // Clean the input: keep only alphanumeric characters and convert to lowercase
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Check if the cleaned string is equal to its reverse
        String cleanedStr = cleaned.toString();
        String reversedStr = cleaned.reverse().toString();
        
        return cleanedStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car"));                    // false
    }
}


//2. Question: Implement a method that counts the number of vowels (a, e, i, o, u) in a given string,
//case-insensitive. Input: "Hello World"
//Output: 3 Input: "Programming Interview"
//Output: 6
public class VowelCounter {
    public static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Hello World"));         // Output: 3
        System.out.println(countVowels("Programming Interview"));// Output: 6
    }
}



  **Joining Strings**
//1. Question: Write a method that joins an array of strings with a specified delimiter, without using built-in join methods. 
//Input: ["apple", "banana", "cherry"], delimiter: ", "
//Output: "apple, banana, cherry" Input: ["Java", "is", "fun"], delimiter: "-"
//Output: "Java-is-fun"
public class StringJoiner {
    public static String joinStrings(String[] arr, String delimiter) {
        if (arr == null || arr.length == 0) return "";

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
            if (i < arr.length - 1) {
                result.append(delimiter);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(joinStrings(new String[]{"apple", "banana", "cherry"}, ", ")); // apple, banana, cherry
        System.out.println(joinStrings(new String[]{"Java", "is", "fun"}, "-"));          // Java-is-fun
    }
}

    
//2. Question: Implement a method that concatenates alternating characters from two input strings.If one string is longer than the other, append the remaining characters. 
//Input: "abc", "123"
//Output: "a1b2c3" Input: "hello", "world!"
//Output: "hweolrllod!"
public class AlternateMerger {
    public static String mergeAlternating(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(s1.length(), s2.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < s1.length()) result.append(s1.charAt(i));
            if (i < s2.length()) result.append(s2.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternating("abc", "123"));      // Output: a1b2c3
        System.out.println(mergeAlternating("hello", "world!")); // Output: hweolrllod!
    }
}


**Additional String Methods**
//1. Question: Create a method that finds the longest substring without repeating characters in agiven string. 
//Input: "abcabcbb"
//Output: "abc" (or "cab" or "abc" - any substring of length 3 without repeating characters)
//Input: "bbbbb"
//Output: "b" Input: "pwwkew"
//Output: "wke" (or "kew")
public class LongestUniqueSubstring {
    public static String longestUniqueSubstring(String s) {
        int start = 0, maxStart = 0, maxLen = 0;
        StringBuilder window = new StringBuilder();

        for (char c : s.toCharArray()) {
            int index = window.indexOf(String.valueOf(c));
            if (index != -1) {
                window.delete(0, index + 1);
                start += index + 1;
            }
            window.append(c);
            if (window.length() > maxLen) {
                maxLen = window.length();
                maxStart = start;
            }
        }

        return s.substring(maxStart, maxStart + maxLen);
    }

    public static void main(String[] args) {
        System.out.println(longestUniqueSubstring("abcabcbb")); // abc
        System.out.println(longestUniqueSubstring("bbbbb"));    // b
        System.out.println(longestUniqueSubstring("pwwkew"));   // wke or kew
    }
}

//2. Question: Write a method that takes a string and returns the first non-repeated character. If allcharacters are repeated, return null.
//Input: "swiss"
//Output: "w" Input: "aabb"
//Output: null
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static Character firstNonRepeated(String s) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char c : s.toCharArray())
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);

        for (Map.Entry<Character, Integer> entry : countMap.entrySet())
            if (entry.getValue() == 1)
                return entry.getKey();

        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeated("swiss")); // Output: w
        System.out.println(firstNonRepeated("aabb"));  // Output: null
    }
}


  **StringBuffer**
//1. Question: Implement a method using StringBuffer to reverse every word in a sentence whilemaintaining the word order. 
//Input: "Java programming is fun"
//Output: "avaJ gnimmargorp si nuf" Input: "Hello World"
//Output: "olleH dlroW"
public class ReverseWords {
    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuffer result = new StringBuffer();

        for (String word : words) {
            result.append(new StringBuffer(word).reverse()).append(" ");
        }

        return result.toString().trim(); // Remove trailing space
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("Java programming is fun")); // avaJ gnimmargorp si nuf
        System.out.println(reverseEachWord("Hello World"));             // olleH dlroW
    }
}


//2. Question: Write a method using StringBuffer to efficiently remove all occurrences of a givencharacter from a string. 
//Input: "programming", character: 'm'
//Output: "prograing" Input: "banana", character: 'a'
//Output: "bnn"
public class RemoveChar {
    public static String removeCharacter(String s, char ch) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ch) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeCharacter("programming", 'm')); // Output: prograing
        System.out.println(removeCharacter("banana", 'a'));      // Output: bnn
    }
}


  **StringBuilder**
//1. Question: Implement a method using StringBuilder to efficiently generate all possible substrings of a given string.
//Input: "abc"
//Output: ["a", "ab", "abc", "b", "bc", "c"] Input: "xy"
//Output: ["x", "xy", "y"]
import java.util.ArrayList;
import java.util.List;

public class SubstringGenerator {
    public static List<String> allSubstrings(String s) {
        List<String> substrings = new ArrayList<>();

        for (int start = 0; start < s.length(); start++) {
            StringBuilder sb = new StringBuilder();
            for (int end = start; end < s.length(); end++) {
                sb.append(s.charAt(end));
                substrings.add(sb.toString());
            }
        }

        return substrings;
    }

    public static void main(String[] args) {
        System.out.println(allSubstrings("abc")); // [a, ab, abc, b, bc, c]
        System.out.println(allSubstrings("xy"));  // [x, xy, y]
    }
}


    
//2. Question: Create a method using StringBuilder to insert a space after every n characters in astring, except at the end. 
//Input: "ABCDEFGHIJKLMNOPQR", n=4
//Output: "ABCD EFGH IJKL MNOP QR" Input: "programming", n=3
//Output: "pro gra mmi ng"
public class InsertSpaces {
    public static String insertSpaces(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if ((i + 1) % n == 0 && i != s.length() - 1) {
                sb.append(' ');
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(insertSpaces("ABCDEFGHIJKLMNOPQR", 4)); // ABCD EFGH IJKL MNOP QR
        System.out.println(insertSpaces("programming", 3));        // pro gra mmi ng
    }
}
