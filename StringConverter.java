package com.om;

public class StringConverter {

    // Method to convert consonants to $ and vowels to #
    public String convertString(String input) {
        if (input == null) {
            return null;
        }

        StringBuilder result = new StringBuilder();
        String vowels = "AEIOUaeiou";

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    result.append('#');
                } else {
                    result.append('$');
                }
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        StringConverter converter = new StringConverter();
        String input1 = "He675llo, World!";
        String input2 = "Hello, World!";
        String output1 = converter.convertString(input1);
        System.out.println("Input1: " + input1);
        System.out.println("Output1: " + output1);
        String output2 = converter.convertString(input2);
        System.out.println("Input2: " + input2);
        System.out.println("Output2: " + output2);
    }
}

