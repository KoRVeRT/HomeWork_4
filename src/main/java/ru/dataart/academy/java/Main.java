package ru.dataart.academy.java;

public class Main {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        try {
            System.out.println("Reverse integer works: " + reverseInteger.reverse(-456));
            System.out.println("Reverse integer works: " + reverseInteger.reverse(1346547));
            System.out.println("Reverse integer works for big negative value: " + reverseInteger.reverse(-2147483648));
            System.out.println("Reverse integer works for big positive value: " + reverseInteger.reverse(2147483647));
        } catch (IntegerOverflowException e) {
            System.out.printf("%s: %s%n", e.getClass().getSimpleName(), e.getMessage());
        }
    }
}