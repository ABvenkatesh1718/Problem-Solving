
import java.util.StringTokenizer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author venkatesh
 */
import java.util.StringTokenizer;

public class Tokenization {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter a line of code:");
        String input = scanner.nextLine();

        String delimiters = " +-*/%^=;(),{}[]<>&|!";
        String operators = "+-*/%^=<>!&|";

        String[] keywords = {"int", "float", "char", "if", "else", "for", "while", "do", "switch", "case", "break", "continue", "return"};

        StringTokenizer tokenizer = new StringTokenizer(input, delimiters, true);
        int operatorCount = 0, separatorCount = 0, identifierCount = 0, keywordCount = 0, invalidIdentifierCount = 0;

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().trim();

            if (!token.isEmpty()) {
                if (operators.contains(token)) {
                    System.out.println("Operator: " + token);
                    operatorCount++;
                } else if (delimiters.contains(token)) {
                    System.out.println("Separator: " + token);
                    separatorCount++;
                } else {

                    boolean isKeyword = false;
                    for (String keyword : keywords) {
                        if (token.equals(keyword)) {
                            System.out.println("Keyword: " + token);
                            keywordCount++;
                            isKeyword = true;
                            break;
                        }
                    }

                    if (!isKeyword) {
                        if (Character.isLetter(token.charAt(0)) || token.charAt(0) == '_') {
                            boolean isValidIdentifier = true;
                            for (int i = 1; i < token.length(); i++) {
                                if (!Character.isLetterOrDigit(token.charAt(i)) && token.charAt(i) != '_') {
                                    isValidIdentifier = false;
                                    break;
                                }
                            }
                            if (isValidIdentifier) {
                                System.out.println("Identifier: " + token);
                                identifierCount++;
                            } else {
                                System.out.println("Invalid Identifier: " + token);
                                invalidIdentifierCount++;
                            }
                        } else {
                            System.out.println("Invalid Identifier: " + token);
                            invalidIdentifierCount++;
                        }
                    }

                }
            }
        }

        System.out.println("\nCounts:");
        System.out.println("Operators: " + operatorCount);
        System.out.println("Separators: " + separatorCount);
        System.out.println("Identifiers: " + identifierCount);
        System.out.println("Keywords: " + keywordCount);
        System.out.println("Invalid Identifiers: " + invalidIdentifierCount);
    }
}
