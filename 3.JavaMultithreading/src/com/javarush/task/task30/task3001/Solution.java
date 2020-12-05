package com.javarush.task.task30.task3001;

import java.math.BigInteger;

/*
Конвертер систем счислений
*/
public class Solution {
    public static void main(String[] args) {
        Number number = new Number(NumberSystemType._2, "1101001000000001100001001110110111111100110010101000100111011011011001001011001100011001100000111101111");
        Number result = convertNumberToOtherNumerationSystem(number, NumberSystemType._3);
        System.out.println(result);
        number = new Number(NumberSystemType._2, "1101001000000001100001001110110111111100110010101000100111011011011001001011001100011001100000111101111");
        result = convertNumberToOtherNumerationSystem(number, NumberSystemType._4);
        System.out.println(result);
        number = new Number(NumberSystemType._2, "1101001000000001100001001110110111111100110010101000100111011011011001001011001100011001100000111101111");
        result = convertNumberToOtherNumerationSystem(number, NumberSystemType._5);
        System.out.println(result);
        number = new Number(NumberSystemType._2, "1101001000000001100001001110110111111100110010101000100111011011011001001011001100011001100000111101111");
        result = convertNumberToOtherNumerationSystem(number, NumberSystemType._6);
        System.out.println(result);
        number = new Number(NumberSystemType._2, "1101001000000001100001001110110111111100110010101000100111011011011001001011001100011001100000111101111");
        result = convertNumberToOtherNumerationSystem(number, NumberSystemType._7);
        System.out.println(result);
        number = new Number(NumberSystemType._2, "1101001000000001100001001110110111111100110010101000100111011011011001001011001100011001100000111101111");
        result = convertNumberToOtherNumerationSystem(number, NumberSystemType._8);
        System.out.println(result);
        number = new Number(NumberSystemType._2, "1101001000000001100001001110110111111100110010101000100111011011011001001011001100011001100000111101111");
        result = convertNumberToOtherNumerationSystem(number, NumberSystemType._9);
        System.out.println(result);
        number = new Number(NumberSystemType._2, "1101001000000001100001001110110111111100110010101000100111011011011001001011001100011001100000111101111");
        result = convertNumberToOtherNumerationSystem(number, NumberSystemType._10);
        System.out.println(result);
        number = new Number(NumberSystemType._2, "1101001000000001100001001110110111111100110010101000100111011011011001001011001100011001100000111101111");
        result = convertNumberToOtherNumerationSystem(number, NumberSystemType._12);
        System.out.println(result);
        number = new Number(NumberSystemType._2, "111");
        result = convertNumberToOtherNumerationSystem(number, NumberSystemType._2);
        System.out.println(result);
    }

    public static Number convertNumberToOtherNumerationSystem(Number number, NumberSystem expectedNumerationSystem) {
        BigInteger bigInt = new BigInteger(number.getDigit(), number.getNumerationSystem().getNumberSystemIntValue());

        return new Number(expectedNumerationSystem, bigInt.toString(expectedNumerationSystem.getNumberSystemIntValue()));

    }
}