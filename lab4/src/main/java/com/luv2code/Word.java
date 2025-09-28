package com.luv2code;

import java.util.ArrayList;
import java.util.List;

public class Word {
    private final List<Letter> letters;

    public Word(String word) {
        letters = new ArrayList<>();
        for (char c : word.toCharArray()) {
            letters.add(new Letter(c));
        }
    }

    public int length() {
        return letters.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Letter l : letters) {
            sb.append(l);
        }
        return sb.toString();
    }
}
