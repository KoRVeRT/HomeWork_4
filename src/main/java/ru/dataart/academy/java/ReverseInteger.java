package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */
    public int reverse(int inputNumber) {
        boolean negativeNumber = false;
        if (inputNumber < 0) {
            negativeNumber = true;
            inputNumber = Math.abs(inputNumber);
        }
        int previousReverseNumber = 0, reverseNumber = 0;
        while (inputNumber != 0) {
            int currentDigit = inputNumber % 10;
            reverseNumber = reverseNumber * 10 + currentDigit;
            if ((reverseNumber - currentDigit) / 10 != previousReverseNumber) {
                throw new NumberReverseException("The number cannot be converted.");
            }
            previousReverseNumber = reverseNumber;
            inputNumber = inputNumber / 10;
        }
        return (negativeNumber) ? -reverseNumber : reverseNumber;
    }
}