package com.luv2code;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private final List<Object> elements;

    public Sentence(String rawSentence) {
        elements = new ArrayList<>();
        String normalized = rawSentence.replaceAll("\\s+", " ").trim();

        String[] tokens = normalized.split(" ");
        for (String token : tokens) {
            if (token.matches("[.!?,;:]+")) {
                for (char c : token.toCharArray()) {
                    elements.add(new PunctuationMark(c));
                }
            } else {
                String wordPart = token.replaceAll("[.!?,;:]+$", "");
                if (!wordPart.isEmpty()) {
                    elements.add(new Word(wordPart));
                }
                String punct = token.replaceAll(".*?([.!?,;:]+)$", "$1");
                if (!punct.equals(token)) {
                    for (char c : punct.toCharArray()) {
                        elements.add(new PunctuationMark(c));
                    }
                }
            }
        }
    }

    public int countWords() {
        int count = 0;
        for (Object obj : elements) {
            if (obj instanceof Word) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Object obj : elements) {
            if (obj instanceof Word) {
                if (!sb.isEmpty() && sb.charAt(sb.length() - 1) != ' ') {
                    sb.append(" ");
                }
                sb.append(obj);
            } else {
                sb.append(obj);
            }
        }
        return sb.toString().trim();
    }
}
