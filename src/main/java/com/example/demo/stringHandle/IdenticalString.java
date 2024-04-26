package com.example.demo.stringHandle;

public class IdenticalString {

    public static void main(String[] args) {
        System.out.println("Enter a string containing only alphabet characters a-z:");

        String result = removeConsecutiveCharacters("inppppput");
        System.out.println("Result after removing consecutive characters: " + result);
    }

    public static String removeConsecutiveCharacters(String input) {
        StringBuilder sb = new StringBuilder(input);
        boolean changed;

        do {
            changed = false;
            int consecutiveCount = 1;

            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    consecutiveCount++;
                    if (consecutiveCount >= 3) {
                        sb.delete(i, i + consecutiveCount);
                        changed = true;
                        break;
                    }
                } else {
                    consecutiveCount = 1;
                }
            }
        } while (changed);

        return sb.toString();
    }
}
