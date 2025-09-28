package com.luv2code;

public class Candy extends Sweet {
    private final double chocolatePercentage;

    public Candy(String name, double weight, double sugarContent, double chocolatePercentage) {
        super(name, weight, sugarContent);
        this.chocolatePercentage = chocolatePercentage;
    }

    public double getChocolatePercentage() {
        return chocolatePercentage;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(", chocolate=%.1f%%", chocolatePercentage);
    }
}
