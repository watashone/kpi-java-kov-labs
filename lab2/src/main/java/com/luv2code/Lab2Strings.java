package com.luv2code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Lab2Strings {

    public static void main(String[] args) {
        try {
            String text = "Hello world! This is the first sentence. Is this a question? " +
                    "Short. A much longer sentence with many words inside it.";

            System.out.println("Original text:");
            System.out.println(text);
            System.out.println("--------------------------------------------------");

            String[] sentences = text.split("[.!?]");

            sentences = Arrays.stream(sentences)
                    .map(String::trim)
                    .filter(s -> !s.isEmpty())
                    .toArray(String[]::new);

            System.out.println("Detected sentences:");
            for (int i = 0; i < sentences.length; i++) {
                System.out.printf("%2d: %s%n", i + 1, sentences[i]);
            }
            System.out.println("--------------------------------------------------");

            Arrays.sort(sentences, Comparator.comparingInt(Lab2Strings::countWords));

            System.out.println("Sentences sorted by ascending word count:");
            for (String s : sentences) {
                System.out.printf("[words=%d] %s%n", countWords(s), s);
            }

        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }

    private static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
}

