package lesson_13;

import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        String[] words = {"Almaty", "Beijing", "Paris", "Berlin", "KL", "New York", "Paris", "Lisbon", "Doha", "Vancouver"};
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        for (String word : uniqueWords) {
            System.out.println(word);
        }
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
