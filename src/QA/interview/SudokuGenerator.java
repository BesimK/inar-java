package QA.interview;

public class SudokuGenerator {
    public static void main(String[] args) {
        System.out.println("Here is the Sudoku Generator!!!");
        generateSudoku();
    }

    public static void generateSudoku() {
        int[][] sudokuBoard = new int[9][9];
        fillSudokuBoard(sudokuBoard);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("|" + sudokuBoard[i][j] +"|");
            }
            System.out.println();
        }
    }

    public static void fillSudokuBoard(int[][] sudokuBoard) {
        int number;
        for (int row = 0; row < sudokuBoard.length; row++) {
            for (int col = 0; col < sudokuBoard[row].length; col++) {
                number = (int)(Math.random()*10);
                if(isAvailable(sudokuBoard,number,row,col)){
                    sudokuBoard[row][col]=number;
                }
                else {
                    col--;
                }
            }
        }
    }
    public static boolean isAvailable(int [][] sudokuBoard, int number, int row, int col) {
     return rowCheck(sudokuBoard ,number,col) ||
        colCheck(sudokuBoard ,number,row) ||
        boxCheck(sudokuBoard ,number,row,col);
    }
    public static boolean colCheck(int [][] sudokuBoard, int number, int col) {
        for (int i = 0; i < 9; i++) {
            if (sudokuBoard[i][col] == 0) {
                continue;
            } else if (sudokuBoard[i][col] == number) {
                return false;
            }
        }
        return true;
    }
    public static boolean rowCheck(int [][] sudokuBoard, int number, int row) {
        for (int i = 0; i < 9; i++) {
            if (sudokuBoard[row][i] == 0) {
                continue;
            }
            else if (sudokuBoard[row][i] == number) {
                return false;
            }
        }
        return true;
    }
    public static boolean boxCheck(int [][] sudokuBoard, int number,int row ,int col) {
        for (int i = row/3; i < 3; i++) {
            for (int j = col%3; j < 3; j++) {
                if (sudokuBoard[i][j]==0){
                    continue;
                } else if (sudokuBoard[i][j]==number) {
                    return false;
                }
            }
        }
        return true;
    }
}
