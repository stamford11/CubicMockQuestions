package Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class QuestionsMethods {

    public static void reverseString(String str) {
        StringBuffer sbr = new StringBuffer(str);
        // To reverse the string
        sbr.reverse();
        System.out.println(sbr);
    }

    public static void factorialGen(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("factorial of number is: " + fact);
    }

    public static void sumOfDoubleInt(int num, double num1) {
        double sum = num + num1;
        System.out.println("Double Sum is: " + sum);
        int sum1 = (int) (num + num1);
        System.out.println("int casting Sum is: " + sum1);
    }

    public static void countVowel(String str) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 0);
        map.put("e", 0);
        map.put("i", 0);
        map.put("o", 0);
        map.put("u", 0);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'A') {
                map.put("a", map.get("a") + 1);
            } else if (ch == 'e' || ch == 'E') {
                map.put("e", map.get("e") + 1);
            } else if (ch == 'i' || ch == 'I') {
                map.put("i", map.get("i") + 1);
            } else if (ch == 'o' || ch == 'O') {
                map.put("o", map.get("o") + 1);
            } else if (ch == 'u' || ch == 'U') {
                map.put("u", map.get("u") + 1);
            }
        }

        // print the frequency of each vowel
        System.out.println("a:" + map.get("a"));
        System.out.println("e:" + map.get("e"));
        System.out.println("i:" + map.get("i"));
        System.out.println("o:" + map.get("o"));
        System.out.println("u:" + map.get("u"));
    }

    public static void countLetter(String str) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (Entry<Character, Integer> entry : map.entrySet())
            System.out.print(entry.getKey() + "" + entry.getValue());
    }
    //driver class---main class
    public static void main(String[] args) {

        reverseString("qwerty");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        factorialGen(5);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        sumOfDoubleInt(100, 400.00);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        countVowel("Java Is amazing");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        countLetter("kokololomomososo");

    }
}
