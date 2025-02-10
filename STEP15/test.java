package STEP15;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length; // Total rows in the grid
        int cols = grid[0].length; // Total columns in the grid
        Queue<int[]> rottenQueue = new LinkedList<>(); // Queue to track rotten oranges
        int freshCount = 0; // Counter for fresh oranges

        // Traverse the grid to initialize the queue and count fresh oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    rottenQueue.offer(new int[]{i, j}); // Add rotten orange to the queue
                } else if (grid[i][j] == 1) {
                    freshCount++; // Count fresh oranges
                }
            }
        }

        // If there are no fresh oranges, no time is needed
        if (freshCount == 0) return 0;

        // Directions for adjacent cells: up, down, left, right
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int minutes = 0; // Time counter

        // Perform BFS to simulate the rotting process
        while (!rottenQueue.isEmpty()) {
            int size = rottenQueue.size();
            boolean hasRotten = false; // Flag to check if any orange rots in this round

            // Process all rotten oranges in the current minute
            for (int i = 0; i < size; i++) {
                int[] current = rottenQueue.poll();
                int x = current[0];
                int y = current[1];

                // Check all four adjacent cells
                for (int[] direction : directions) {
                    int newX = x + direction[0];
                    int newY = y + direction[1];

                    // If the adjacent cell is a fresh orange, rot it
                    if (newX >= 0 && newX < rows && newY >= 0 && newY < cols && grid[newX][newY] == 1) {
                        grid[newX][newY] = 2; // Mark the orange as rotten
                        rottenQueue.offer(new int[]{newX, newY}); // Add to the queue
                        freshCount--; // Reduce the fresh orange count
                        hasRotten = true; // Mark that we rotted an orange
                    }
                }
            }

            // Increment time only if at least one orange rotted in this round
            if (hasRotten) minutes++;
        }

        // If all fresh oranges are rotten, return the time; otherwise, return -1
        return freshCount == 0 ? minutes : -1;
    }
}
