/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BagOfTokens {

    public static int maxScore(ArrayList<Integer> tokens, int power, int low, int high, int score) {
        // Base case: no tokens left or not enough power to play any token.
        if (low > high) {
            return score;
        }

        // Case 1: Play the lowest valued token for score.
        if (power >= tokens.get(low)) {
            return maxScore(tokens, power - tokens.get(low), low + 1, high, score + 1);
        }
        // Case 2: If score is available, regain power by playing the highest valued token.
        else if (score > 0) {
            return maxScore(tokens, power + tokens.get(high), low, high - 1, score - 1);
        }
        // No move possible.
        return score;
    }

    public static void main(String[] args) {
        ArrayList<Integer> tokens = new ArrayList<>(Arrays.asList(200, 100));
        Collections.sort(tokens); // Sort in ascending order for strategy
        int score = 0, power = 150;
        int maxScore = maxScore(tokens, power, 0, tokens.size() - 1, score);
        System.out.println(maxScore);
    }
}
