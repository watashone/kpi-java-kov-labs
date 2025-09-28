package com.luv2code.sweets;

public class ChocolateBar extends Sweet {
    private final double cocoaPercentage;

    public ChocolateBar(String name, double weight, double sugarContent, double cocoaPercentage) {
        super(name, weight, sugarContent);
        this.cocoaPercentage = cocoaPercentage;
    }

    public double getCocoaPercentage() {
        return cocoaPercentage;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(", cocoa=%.1f%%", cocoaPercentage);
    }
}
