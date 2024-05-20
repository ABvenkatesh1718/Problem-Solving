/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

/**
 *
 * @author venkatesh
 */
import java.util.ArrayList;
import java.util.Scanner;

public class RobotNavigation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input grid, rows, and columns
        System.out.print("Enter the grid: ");
        String grid = scanner.next();
        System.out.print("Enter the number of rows and columns: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Input obstacle coordinates
        System.out.print("Enter the number of obstacles: ");
        int obstacleCount = scanner.nextInt();
        ArrayList<Pair<Integer, Integer>> obstacles = new ArrayList<>();
        System.out.println("Enter obstacle coordinates (row column):");
        for (int i = 0; i < obstacleCount; ++i) {
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            obstacles.add(new Pair<>(row, col));
        }

        // Get the final position
        Pair<Integer, Integer> finalPos = finalPosition(grid, rows, cols, obstacles);

        // Print the final position
        System.out.println("Final position of the robot: (" + finalPos.getKey() + ", " + finalPos.getValue() + ")");
    }

    static Pair<Integer, Integer> finalPosition(String grid, int rows, int cols, ArrayList<Pair<Integer, Integer>> obstacles) {
        int x = 0, y = 0; // starting position
        for (char move : grid.toCharArray()) {
            if (move == 'U' && y < rows - 1 && !obstacles.contains(new Pair<>(x, y + 1))) {
                y += 1;
            } else if (move == 'D' && y > 0 && !obstacles.contains(new Pair<>(x, y - 1))) {
                y -= 1;
            } else if (move == 'L' && x > 0 && !obstacles.contains(new Pair<>(x - 1, y))) {
                x -= 1;
            } else if (move == 'R' && x < cols - 1 && !obstacles.contains(new Pair<>(x + 1, y))) {
                x += 1;
            } else if (move == 'X') {
                continue; // obstacle encountered, do not move
            }
        }
        return new Pair<>(x, y);
    }

    static class Pair<K, V> {
        private final K key;
        private final V value;

        Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}

