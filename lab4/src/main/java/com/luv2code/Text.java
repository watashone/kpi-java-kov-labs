package com.luv2code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Text {
    private final List<Sentence> sentences;

    public Text(String rawText) {
        sentences = new ArrayList<>();

        String[] rawSentences = rawText.split("(?<=[.!?])");
        for (String s : rawSentences) {
            String trimmed = s.trim();
            if (!trimmed.isEmpty()) {
                sentences.add(new Sentence(trimmed));
            }
        }
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void sortByWordCount() {
        sentences.sort(Comparator.comparingInt(Sentence::countWords));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sentence s : sentences) {
            sb.append(s).append(" ");
        }
        return sb.toString().trim();
    }
}
