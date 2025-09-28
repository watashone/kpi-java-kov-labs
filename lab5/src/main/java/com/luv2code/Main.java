package com.luv2code;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gift gift = new Gift();

        Candy mars = new Candy("Mars", 50, 30, 40);
        Candy snickers = new Candy("Snickers", 55, 35, 45);
        Candy bounty = new Candy("Bounty", 48, 32, 35);

        ChocolateBar milka = new ChocolateBar("Milka", 100, 55, 70);

        Cookie oreo = new Cookie("Oreo", 75, 25);

        gift.addSweet(mars);
        gift.addSweet(snickers);
        gift.addSweet(bounty);
        gift.addSweet(milka);
        gift.addSweet(oreo);

        System.out.println("Gift contents:");
        gift.printGift();

        System.out.printf("%nTotal weight of gift: %.1fg%n", gift.getTotalWeight());

        System.out.println("\nSorted by weight:");
        gift.sortByWeight();
        gift.printGift();

        System.out.println("\nCandies with chocolate percentage in range 36% - 50%:");
        List<Candy> found = gift.findCandiesByChocolateRange(36, 50);
        for (Candy c : found) {
            System.out.println(c);
        }
    }
}