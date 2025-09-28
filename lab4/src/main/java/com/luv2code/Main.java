package com.luv2code;

public class Main {
    public static void main(String[] args) {
        try {
            String text = "Hello   world!   This is  the   first sentence.   Is this a question? " +
                    "Short. A much longer sentence with many words inside it.";

            System.out.println("Original text:");
            System.out.println(text);
            System.out.println("--------------------------------------------------");

            Text parsedText = new Text(text);

            System.out.println("Detected sentences:");
            int i = 1;
            for (Sentence s : parsedText.getSentences()) {
                System.out.printf("%2d: %s%n", i++, s);
            }
            System.out.println("--------------------------------------------------");

            parsedText.sortByWordCount();

            System.out.println("Sentences sorted by ascending word count:");
            for (Sentence s : parsedText.getSentences()) {
                System.out.printf("[words=%d] %s%n", s.countWords(), s);
            }

        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }
}