package QA.assignments;

import java.util.*;

public class Question_07_22 {
    public static void main(String[] args) {
        int[] chessboard = new int[64];
        while (queenCounter(chessboard)!=8) {
            queen8(chessboard, 1);
        }
        displayChessboard(chessboard);
    }

    private static int queenCounter(int[] chessboard) {
        int count =0;
        for (int i = 0; i < chessboard.length; i++) {
            if(chessboard[i]==2){
                count++;
            }
        }

        return count;
    }

    public static void displayChessboard(int[] chessboard) {
        for (int i = 1; i <= chessboard.length; i++) {
            if (i % 8 == 0) {
                System.out.println((chessboard[i - 1]==1||chessboard[i - 1]==0)?"[ ]":"[Q]");
                //  System.out.println(chessboard[i-1]);
            } else {
                System.out.print((chessboard[i - 1]==1||chessboard[i - 1]==0)?"[ ]":"[Q]");
                // System.out.print(chessboard[i-1] + " ");
            }
        }
    }

    public static void queen8(int[] chessboard, int queenCounter) {
        if(queenCounter==9) return;
        int queenPosition = (int) (Math.random() * 64);
        if (queenCounter == 1) {
            Arrays.fill(chessboard, 0);
        }
        if (chessboard[queenPosition] == 0) {

            chessboard[queenPosition] = 2;
            for (int i = 1; (queenPosition + i) % 8 != 0; i++) {//Deactivation of right hand positions

                chessboard[queenPosition + i] = 1;
            }
            for (int i = -1; (queenPosition + i + 1) % 8 > 0 && (queenPosition + i) >= 0; i--) {//Deactivation of left hand positions
                chessboard[queenPosition + i] = 1;
            }
            for (int i = 8; (queenPosition + i + 1) / 8 <= 7; i += 8) {//Deactivation of downwards positions
                chessboard[queenPosition + i] = 1;
            }
            for (int i = -8; (queenPosition + i) >= 0; i -= 8) {//Deactivation of upwards positions
                chessboard[queenPosition + i] = 1;
            }
            for (int i = -7; (queenPosition + i) / 8 >= 0 && (queenPosition + i) % 8 != 0 && (queenPosition + i) >= 0; i -= 7) {//Deactivation of right upwards positions
                chessboard[queenPosition + i] = 1;
            }
            for (int i = -9; (queenPosition + i) / 8 >= 0 && (queenPosition + i + 1) % 8 != 0 && (queenPosition + i) >= 0; i -= 9) {//Deactivation of left upwards positions
                chessboard[queenPosition + i] = 1;
            }
            for (int i = 9; (queenPosition + i) / 8 < 8 && ((queenPosition + i - 1) % 8) != 7; i += 9) {//Deactivation of right downwards positions
                chessboard[queenPosition + i] = 1;
            }
            for (int i = 7; (queenPosition + i) / 8 < 8 && (queenPosition + i + 1) % 8 != 0; i += 7) {//Deactivation of left downwards positions
                chessboard[queenPosition + i] = 1;
            }

            queenCounter++;
            queen8(chessboard,queenCounter);

        }
        else if(linearSearch(chessboard,0)<0){
            queen8(chessboard,1);
        }
        else {
            queen8(chessboard, queenCounter);
        }
    }
    public static int linearSearch(int[] chessboard, int key){
        int index = -1;
        for (int i=0;i<chessboard.length;i++) {
            if (chessboard[i] == key) {
                index=i;
                break;
            }
        }
        return index;
    }
}
