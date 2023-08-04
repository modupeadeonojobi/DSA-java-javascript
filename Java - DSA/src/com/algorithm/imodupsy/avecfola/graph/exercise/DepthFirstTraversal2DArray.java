package com.algorithm.imodupsy.avecfola.graph.exercise;

import java.util.Stack;

/**
 * @author iModupsy
 * @created 04/08/2023
 */
public class DepthFirstTraversal2DArray {


    public static void main(String[] args) {
        int[][] grid = {
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 1, 1},
                {1, 0, 1, 1, 0},
                {1, 1, 0, 1, 1},
                {1, 0, 1, 9, 1}
        };

        boolean treasureFound = dfs(grid, 0, 0);

        if (!treasureFound) {
            System.out.println("The treasure hunt cannot be found in the maze");
        }
    }

    private static boolean dfs(int[][] grid, int startRow, int startCol) {

        int numRows = grid.length;
        int numCols = grid[0].length;

        // Create a stack to store the cells to be visited
        Stack<int[]> stack = new Stack<>();

        // Push the starting cell to the stack
        stack.push(new int[]{startRow, startCol});


        while (!stack.isEmpty()) {
            int currentCell[] = stack.pop();
            int row = currentCell[0];
            int col = currentCell[1];

            // If the cell is out of bounds or already visited, skip it
            if (row < 0 || row >= numRows || col < 0 || col >= numCols || grid[row][col] == 0) {
                continue;
            }

            // If we found the treasure (value 9), return true
            if (grid[row][col] == 9) {
                System.out.println("Treasure found at position (" + row + ", " + col + ")");
                return true;
            }

            // Mark the current cell as visited (value 0)
            grid[row][col] = 0;

            // Add adjacent cells to the stack for further exploration
            stack.push(new int[]{row - 1, col}); // up
            stack.push(new int[]{row + 1, col}); // down
            stack.push(new int[]{row, col - 1}); // left
            stack.push(new int[]{row, col + 1}); // right
        }

        return false;
    }


}
