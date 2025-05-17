//Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().
 public class StringCheck { 
    public sta c boolean isNullOrEmpty(String str) { 
        return str == null || str.trim().isEmpty(); 
    } 
 
    public sta c void main(String[] args) { 
        String str1 = "   "; 
        String str2 = null; 
        String str3 = "Hello"; 
 
        System.out.println("str1 is empty: " + isNullOrEmpty(str1)); 
        System.out.println("str2 is empty: " + isNullOrEmpty(str2)); 
        System.out.println("str3 is empty: " + isNullOrEmpty(str3)); 
    } 
} 

//Q2. Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()
public class SubstringCounter { 
    public sta c int countOccurrences(String mainStr, String subStr) { 
        if (mainStr == null || subStr == null || subStr.isEmpty()) return 0; 
         
        int count = 0, index = 0; 
        while ((index = mainStr.indexOf(subStr, index)) != -1) { 
            count++; 
            index += subStr.length(); 
        } 
        return count; 
    } 
     public sta c void main(String[] args) { 
        String mainStr = "Java is fun. Java is powerful. Java!"; 
        String subStr = "Java"; 
 
        System.out.println("Occurrences: " + countOccurrences(mainStr, subStr)); 
    } 
} 

//Q3. Write a Java Program for Reversing the characters in a string using user defined function reverseString().
public class StringReverser { 
    public sta c String reverseString(String str) { 
        return new StringBuilder(str).reverse().toString(); 
    } 
 
    public sta c void main(String[] args) { 
        String str = "Hello World"; 
        System.out.println("Reversed: " + reverseString(str)); 
    } 
}

//Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome():
public class PalindromeChecker { 
    public sta c boolean isPalindrome(String str) { 
        if (str == null) return false; 
         
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        return str.equals(new StringBuilder(str).reverse().toString()); 
    } 
 
    public sta c void main(String[] args) { 
        String str = "A man, a plan, a canal, Panama"; 
        System.out.println("Is palindrome: " + isPalindrome(str)); 
    } 
} 

//Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace()
public class WhitespaceRemover { 
    public sta c String removeWhitespace(String str) { 
        return str.replaceAll("\\s+", ""); 
    } 
 
    public sta c void main(String[] args) { 
        String str = " Hello  World "; 
        System.out.println("Without whitespace: " + removeWhitespace(str)); 
    } 
}

//Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords()
public class Capitalizer { 
    public sta c String capitalizeWords(String str) { 
        String[] words = str.split("\\s+"); 
        StringBuilder result = new StringBuilder(); 
         
        for (String word : words) { 
            if (!word.isEmpty()) { 
                result.append(Character.toUpperCase(word.charAt(0))) 
                      .append(word.substring(1)).append(" "); 
            } 
        } 
        return result.toString().trim(); 
    } 
 
    public sta c void main(String[] args) { 
        String str = "hello world, java is fun!"; 
        System.out.println("Capitalized: " + capitalizeWords(str)); 
    } 
} 


//Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()
public class StringTruncator { 
    public sta c String truncate(String str, int length) { 
        if (str.length() <= length) return str; 
        return str.substring(0, length) + "..."; 
    } 
 
    public sta c void main(String[] args) { 
        String str = "Java is a powerful programming language."; 
        System.out.println("Truncated: " + truncate(str, 10)); 
    } 
} 

//Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()
public class NumericChecker { 
    public sta c boolean isNumeric(String str) { 
        return str.matches("\\d+"); 
    } 
 
    public sta c void main(String[] args) { 
        String str = "12345"; 
        String str2 = "123a5"; 
 
        System.out.println("Is numeric (str1): " + isNumeric(str)); 
        System.out.println("Is numeric (str2): " + isNumeric(str2)); 
    } 
} 

//Q9. Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()
 import java.u l.Random; 
 
public class RandomStringGenerator { 
    public sta c String generateRandomString(int length) { 
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; 
        StringBuilder result = new StringBuilder(); 
        Random random = new Random(); 
 
        for (int i = 0; i < length; i++) { 
            result.append(chars.charAt(random.nextInt(chars.length()))); 
        } 
        return result.toString(); 
    } 
 
    public sta c void main(String[] args) { 
        System.out.println("Random String: " + generateRandomString(10)); 
    } 
} 

//Q10. Write a Java Program for Counting the number of words in a string using user defined function countWords()
public class WordCounter { 
    public sta c int countWords(String str) { 
        if (str == null || str.trim().isEmpty()) return 0; 
        return str.trim().split("\\s+").length; 
    } 
 
    public sta c void main(String[] args) { 
        String str = "Java is awesome!"; 
        System.out.println("Word count: " + countWords(str)); 
    } 
}
