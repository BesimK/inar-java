package QA.interview;

import java.util.*;

public class RemoveIslands {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        int x = input.nextInt();
        int[][] landscape = new int[x][x];
        randomFill(landscape);
/*
        int[][] landscape = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        int[][] landscape = {
                {0, 0, 0, 0},//{1, 1, 1, 1},
                {0, 0, 1, 0},//{1, 0, 0, 1},
                {0, 0, 1, 0},//{0, 0, 0, 0},
                {0, 0, 1, 0},//{0, 0, 0, 0},
                };
*/
        displayLandscape(landscape);
        isLand(landscape);
        removeIslands(landscape);
        System.out.println("-------------------------------------------------");
        displayLandscape(landscape);
    }

    private static void isLand(int[][] landscape) {

        for (int j = 0; j < landscape.length; j++) {
            if (landscape[0][j] == 1) {
                landscape[0][j] = 2;
                isLand(landscape, 0, j);
            }
            if (landscape[landscape.length - 1][j] == 1) {
                landscape[landscape.length - 1][j] = 2;
                isLand(landscape, landscape.length - 1, j);
            }
            if (landscape[j][0] == 1) {
                landscape[j][0] = 2;
                isLand(landscape, j, 0);
            }
            if (landscape[j][landscape.length - 1] == 1) {
                landscape[j][landscape.length - 1] = 2;
                isLand(landscape, j, landscape.length - 1);
            }
        }

    }

    private static void isLand(int[][] landscape, int row, int col) {
        if (row >= 0 && row < landscape.length - 1 && landscape[row + 1][col] == 1) {
            landscape[row + 1][col] = 2;
            isLand(landscape, row + 1, col);
        }
        if (row > 0 && row < landscape.length && landscape[row - 1][col] == 1) {
            landscape[row - 1][col] = 2;
            isLand(landscape, row - 1, col);
        }
        if (col >= 0 && col < landscape.length - 1 && landscape[row][col + 1] == 1) {
            landscape[row][col + 1] = 2;
            isLand(landscape, row, col + 1);
        }
        if (col > 0 && col < landscape.length && landscape[row][col - 1] == 1) {
            landscape[row][col - 1] = 2;
            isLand(landscape, row, col - 1);
        }
    }

    private static void displayLandscape(int[][] landscape) {
        for (int row = 0; row < landscape.length; row++) {
            System.out.println(Arrays.toString(landscape[row]));
        }
    }

    private static void randomFill(int[][] landscape) {
        for (int row = 0; row < landscape.length; row++) {
            for (int col = 0; col < landscape[row].length; col++) {
                landscape[row][col] = (int) (Math.random() * 2);
            }
        }
    }

    private static void removeIslands(int[][] landscape) {
        for (int row = 0; row < landscape.length; row++) {
            for (int col = 0; col < landscape[row].length; col++) {
                if (landscape[row][col] != 2) {
                    landscape[row][col] = 0;
                }
            }
        }
        for (int row = 0; row < landscape.length; row++) {
            for (int col = 0; col < landscape[row].length; col++) {
                if (landscape[row][col] == 2) {
                    landscape[row][col] = 1;
                }
            }
        }

    }

}
