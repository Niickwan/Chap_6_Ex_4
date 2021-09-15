package com.company;
import java.util.Scanner;

public class Main {

    public static boolean isAbecedarian (String text) {
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) <= text.charAt(i + 1)) {
                // Do nothing, continue for loop.
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to check if's abecedarian: ");
        String text = scanner.next();
        if (isAbecedarian(text)) {
            System.out.println("The word is abecedarian");
        } else {
            System.out.println("The word is not abecedarian");
        }
    }
}
