package QA.interview;

import java.util.*;

public class Queen8Efficient {
    public static void main(String[] args) {
        int[] chessboard = new int[64];
        ArrayList<Integer> remainingPositions = getArrayList();
        queen8(chessboard, remainingPositions, 8);
        displayChessboard(chessboard);
    }

    private static ArrayList<Integer> getArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 64; i++) {
            list.add(i);
        }
        return list;
    }
    public static void queen8(int[] chessboard, ArrayList<Integer> remainingPositions, int remainingQueen) {
        if (remainingQueen >= remainingPositions.size()) {
            Arrays.fill(chessboard, 0);
            remainingPositions.clear();
            remainingPositions = getArrayList();
            queen8(chessboard, remainingPositions, 8);
        }
        int queenPosition = remainingPositions.get((int) (Math.random() * remainingPositions.size()));
        if (chessboard[queenPosition] == 0) {
            chessboard[queenPosition] = 2;
            remainingPositions.remove((Object)(queenPosition));
            --remainingQueen;

            for (int i = 1; (queenPosition + i) % 8 != 0; i++) {//Deactivation of right hand positions
                chessboard[queenPosition + i] = 1;
                try {
                    remainingPositions.remove((Object)(queenPosition + i));
                } catch (Exception e) {
                    continue;
                }
            }
            for (int i = -1; (queenPosition + i + 1) % 8 > 0 && (queenPosition + i) >= 0; i--) {//Deactivation of left hand positions
                chessboard[queenPosition + i] = 1;
                try {
                    remainingPositions.remove((Object)(queenPosition + i));
                } catch (Exception e) {
                    continue;
                }
            }
            for (int i = 8; (queenPosition + i + 1) / 8 <= 7; i += 8) {//Deactivation of downwards positions
                chessboard[queenPosition + i] = 1;
                try {
                    remainingPositions.remove((Object)(queenPosition + i));
                } catch (Exception e) {
                    continue;
                }
            }
            for (int i = -8; (queenPosition + i) >= 0; i -= 8) {//Deactivation of upwards positions
                chessboard[queenPosition + i] = 1;
                try {
                    remainingPositions.remove((Object)(queenPosition + i));
                } catch (Exception e) {
                    continue;
                }
            }
            for (int i = -7; (queenPosition + i) / 8 >= 0 && (queenPosition + i) % 8 != 0 && (queenPosition + i) >= 0; i -= 7) {//Deactivation of right upwards positions
                chessboard[queenPosition + i] = 1;
                try {
                    remainingPositions.remove((Object)(queenPosition + i));
                } catch (Exception e) {
                    continue;
                }
            }
            for (int i = -9; (queenPosition + i) / 8 >= 0 && (queenPosition + i + 1) % 8 != 0 && (queenPosition + i) >= 0; i -= 9) {//Deactivation of left upwards positions
                chessboard[queenPosition + i] = 1;
                try {
                    remainingPositions.remove((Object)(queenPosition + i));
                } catch (Exception e) {
                    continue;
                }
            }
            for (int i = 9; (queenPosition + i) / 8 < 8 && ((queenPosition + i - 1) % 8) != 7; i += 9) {//Deactivation of right downwards positions
                chessboard[queenPosition + i] = 1;
                try {
                    remainingPositions.remove((Object)(queenPosition + i));
                } catch (Exception e) {
                    continue;
                }
            }
            for (int i = 7; (queenPosition + i) / 8 < 8 && (queenPosition + i + 1) % 8 != 0; i += 7) {//Deactivation of left downwards positions
                chessboard[queenPosition + i] = 1;
                try {
                    remainingPositions.remove((Object)(queenPosition + i));
                } catch (Exception e) {
                    continue;
                }
            }
        }
        if (remainingQueen == 3) return;
        queen8(chessboard, remainingPositions, remainingQueen);
    }

    public static void displayChessboard(int[] chessboard) {
        for (int i = 1; i <= chessboard.length; i++) {
            if (i % 8 == 0) {
                System.out.println((chessboard[i - 1] == 1 || chessboard[i - 1] == 0) ? "[ ]" : "[Q]");
                //  System.out.println(chessboard[i-1]);
            } else {
                System.out.print((chessboard[i - 1] == 1 || chessboard[i - 1] == 0) ? "[ ]" : "[Q]");
                // System.out.print(chessboard[i-1] + " ");
            }
        }
    }
}
