package QA.assignments;

import java.util.Scanner;

public class Question_08_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number n");
        int number = input.nextInt();

        char[][] matrix = new char[number][number];

        getTrueInput(number, matrix, input);

        if (control(matrix)) {
            System.out.println("The input array is a Latin square");
        } else {
            System.out.println("The input array is not a Latin square");
        }

    }

    private static void getTrueInput(int number, char[][] matrix, Scanner input) {
        System.out.println("Enter " + number +
                " of letters separated by spaces");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                String s = input.next();
                char ch = s.charAt(0); // 65 + n > ch >= 65
                if (65 + number > ch && ch >= 65) {
                    matrix[i][j] = ch;
                } else {
                    System.out.println("Wrong input: the letters must be from  A to " + (char) (65 + number - 1));
                    System.exit(1);
                }
            }
        }
    }


    public static boolean control(char[][] matrix) {
        return rowControl(matrix) && columnControl(matrix);
    }

    public static boolean columnControl(char[][] matrix) {
        for (int col = 0; col < matrix[0].length; col++) {
            boolean[] controlArray = new boolean[matrix[0].length];
            for (int row = 0; row < matrix.length; row++) {
                if (!controlArray[matrix[row][col] - 65]) {
                    controlArray[matrix[row][col] - 65] = true;
                }
            }
            if (isThereAnyFalse(controlArray)) {
                return false;
            }
        }
        return true;
    }


    public static boolean rowControl(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            boolean[] controlArray = new boolean[matrix[0].length];
            for (int col = 0; col < matrix[0].length; col++) {
                if (!controlArray[matrix[row][col] - 65]) {
                    controlArray[matrix[row][col] - 65] = true;
                }
            }
            if (isThereAnyFalse(controlArray)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isThereAnyFalse(boolean[] controlArray) {
        for (boolean isFalse : controlArray) {
            if (!isFalse) {
                return true;
            }
        }
        return false;
    }

}