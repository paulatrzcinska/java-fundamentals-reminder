package words;

import java.util.Arrays;
import java.util.List;

public class WordsHelper {
    static final List<Character> polishVowels = Arrays.asList('a', 'ą', 'e', 'ę', 'u', 'i', 'o', 'y');

    public static void isPalindrome(String word) {
        System.out.println("Checking if palindrome...");
        String revertedWord = new StringBuilder(word.toLowerCase()).reverse().toString();
        System.out.println(word.equalsIgnoreCase(revertedWord)? "The word is a palindrome": "The word is not a palindrome");
    }

    public static void countVowels(String word) {
        System.out.println("Counting wovels...");
        int counter = 0;
        for (char c : word.toCharArray()) {
            if (polishVowels.contains(c)) {
                counter ++;
            }
        }
        System.out.println("Word " + word + " contains " + counter + " vowels.");
    }
}
