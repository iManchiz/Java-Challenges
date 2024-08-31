package JavaChallenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Challenge8_CountWords {
    public static void main(String[] args) {
        System.out.print("Write a text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        words(text);
    }

    public static void words(String text) {

        text = text.toLowerCase();


        String[] words = text.split("\\s+");


        Map<String, Integer> wordCount = new HashMap<>();


        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println("La palabra '" + entry.getKey() + "' aparece " + entry.getValue() + " veces");
        }
    }
}
