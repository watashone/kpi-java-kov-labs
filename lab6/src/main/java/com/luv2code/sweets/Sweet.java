package com.luv2code.sweets;

public abstract class Sweet {
    private final String name;
    private final double weight;
    private final double sugarContent;

    public Sweet(String name, double weight, double sugarContent) {
        this.name = name;
        this.weight = weight;
        this.sugarContent = sugarContent;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    @Override
    public String toString() {
        return String.format("%s [weight=%.1fg, sugar=%.1fg]", name, weight, sugarContent);
    }
}