package QA.interview;


import java.util.ArrayList;

public class SingleQueen {
    public static void main(String[] args) {
        int[] array = new int[64];
        ArrayList<Integer> remainingPositions = getArrayList();
        queens(array,remainingPositions);
        displayChessboard(array);
    }
    private static ArrayList<Integer> getArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 64; i++) {
            list.add(i);
        }
        return list;
    }
    public static void queens(int[] chessboard,ArrayList<Integer> remainingPositions) {
        int queenPosition = 14;
        remainingPositions.remove(remainingPositions.indexOf(queenPosition));
            chessboard[queenPosition] = 2;
            for (int i = 1; (queenPosition + i) % 8 != 0; i++) {//Deactivation of right hand positions
                chessboard[queenPosition + i] = 1;
                remainingPositions.remove(remainingPositions.indexOf(queenPosition + i));
            }
            for (int i = -1; (queenPosition + i + 1) % 8 > 0 && (queenPosition + i) >= 0; i--) {//Deactivation of left hand positions
                chessboard[queenPosition + i] = 1;
                remainingPositions.remove(remainingPositions.indexOf(queenPosition + i));
            }
            for (int i = 8; (queenPosition + i + 1) / 8 <= 7; i += 8) {//Deactivation of downwards positions
                chessboard[queenPosition + i] = 1;
                remainingPositions.remove(remainingPositions.indexOf(queenPosition + i));
            }
            for (int i = -8; (queenPosition + i) >= 0; i -= 8) {//Deactivation of upwards positions
                chessboard[queenPosition + i] = 1;
                remainingPositions.remove(remainingPositions.indexOf(queenPosition + i));
            }
            for (int i = -7; (queenPosition + i) / 8 >= 0 && (queenPosition + i) % 8 != 0 && (queenPosition + i) >= 0; i -= 7) {//Deactivation of right upwards positions
                chessboard[queenPosition + i] = 1;
                remainingPositions.remove(remainingPositions.indexOf(queenPosition + i));
            }
            for (int i = -9; (queenPosition + i) / 8 >= 0 && (queenPosition + i + 1) % 8 != 0 && (queenPosition + i) >= 0; i -= 9) {//Deactivation of left upwards positions
                chessboard[queenPosition + i] = 1;
                remainingPositions.remove(remainingPositions.indexOf(queenPosition + i));
            }
            for (int i = 9; (queenPosition + i) / 8 < 8 && ((queenPosition + i - 1) % 8) != 7; i += 9) {//Deactivation of right downwards positions
                chessboard[queenPosition + i] = 1;
                remainingPositions.remove(remainingPositions.indexOf(queenPosition + i));
            }
            for (int i = 7; (queenPosition + i) / 8 < 8 && (queenPosition + i + 1) % 8 != 0; i += 7) {//Deactivation of left downwards positions
                chessboard[queenPosition + i] = 1;
                remainingPositions.remove(remainingPositions.indexOf(queenPosition + i));
            }
    }
    public static void displayChessboard(int[] chessboard) {
        for (int i = 1; i <= chessboard.length; i++) {
            if (i % 8 == 0) {
                System.out.println(chessboard[i-1]);
            } else {
               System.out.print(chessboard[i-1] + " ");
            }

        }
    }
}