package com.luv2code.sweets;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Gift {
    private final List<Sweet> sweets;

    public Gift() {
        sweets = new ArrayList<>();
    }

    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
    }

    public double getTotalWeight() {
        return sweets.stream().mapToDouble(Sweet::getWeight).sum();
    }

    public void sortByWeight() {
        sweets.sort(Comparator.comparingDouble(Sweet::getWeight));
    }

    public List<Candy> findCandiesByChocolateRange(double min, double max) {
        List<Candy> result = new ArrayList<>();
        for (Sweet s : sweets) {
            if (s instanceof Candy) {
                Candy c = (Candy) s;
                if (c.getChocolatePercentage() >= min && c.getChocolatePercentage() <= max) {
                    result.add(c);
                }
            }
        }
        return result;
    }

    public void printGift() {
        for (Sweet s : sweets) {
            System.out.println(s);
        }
    }
}