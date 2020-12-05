package com.javarush.task.task30.task3001;

public class Number {
    private NumberSystem numerationSystem;
    private String digit;

    public Number(NumberSystem numerationSystem, String digit) {
        this.numerationSystem = numerationSystem;
        this.digit = digit;
    }

    public NumberSystem getNumerationSystem() {
        return numerationSystem;
    }

    public String getDigit() {
        return digit;
    }

    @Override
    public String toString() {
        return "Number{" +
                "numerationSystem=" + numerationSystem +
                ", digit='" + digit + '\'' +
                '}';
    }
}

