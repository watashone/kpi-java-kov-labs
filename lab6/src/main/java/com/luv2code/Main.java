package com.luv2code;

import com.luv2code.sweets.Candy;
import com.luv2code.sweets.ChocolateBar;
import com.luv2code.sweets.Cookie;
import com.luv2code.sweets.Sweet;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyLinkedSet<Sweet> set1 = new MyLinkedSet<>();
        MyLinkedSet<Sweet> set2 = new MyLinkedSet<>(new Cookie("Oreo", 75, 25));

        List<Sweet> initialList = Arrays.asList(
                new Candy("Mars", 50, 30, 40),
                new Candy("Snickers", 55, 35, 45),
                new ChocolateBar("Milka", 100, 55, 70)
        );
        MyLinkedSet<Sweet> set3 = new MyLinkedSet<>(initialList);

        set1.add(new Candy("Bounty", 48, 32, 35));
        set1.add(new Candy("Snickers", 55, 35, 45));
        set1.add(new ChocolateBar("Alpen Gold", 90, 50, 60));

        System.out.println("Set1 contents:");
        for (Sweet s : set1) {
            System.out.println(s);
        }

        System.out.println("\nSet2 contents:");
        for (Sweet s : set2) {
            System.out.println(s);
        }

        System.out.println("\nSet3 contents:");
        for (Sweet s : set3) {
            System.out.println(s);
        }

        set1.remove(new Candy("Snickers", 55, 35, 45));
        System.out.println("\nAfter remove attempt:");
        for (Sweet s : set1) {
            System.out.println(s);
        }

        System.out.println("\nSize of Set1: " + set1.size());
    }
}