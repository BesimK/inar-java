package QA.interview;

import java.util.*;

public class RemoveIslandsLOTA {
    public static void main(String[] args) {
        removeIslandLota();
    }
    public static void removeIslandLota() {
       /* int[][] landscape = {
                {0, 0, 0, 0},//{1, 1, 1, 1},
                {0, 1, 1, 0},//{1, 0, 0, 1},
                {0, 1, 1, 0},//{0, 0, 0, 0},
                {0, 0, 0, 0},//{0, 0, 0, 0},
        };*/
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

        List<String> indexes = new ArrayList<>();


        for (int i = 0; i < landscape.length; i++) {
            if(landscape[0][i]==1){
                indexes.add(0+"/"+i);
            }
            if(landscape[landscape.length-1][i]==1){
                indexes.add((landscape.length-1)+"/"+i);
            }
            if(landscape[i][0]==1){
                indexes.add(i+"/"+0);
            }
            if(landscape[i][landscape.length-1]==1){
                indexes.add(i+"/"+(landscape.length-1));
            }
        }
        while (!indexes.isEmpty()) {
            String index = indexes.remove(0);
            int row = Integer.parseInt(index.split("/")[0]);
            int col = Integer.parseInt(index.split("/")[1]);
            landscape[row][col]=2;
            if(col+1<landscape.length&&landscape[row][col+1]==1){
                indexes.add(row+"/"+(col+1));
            }
            if(col-1>-1&&landscape[row][col-1]==1){
                indexes.add(row+"/"+(col-1));
            }
            if(row+1<landscape.length&&landscape[row+1][col]==1){
                indexes.add((row+1)+"/"+col);
            }
            if(row-1>-1&&landscape[row-1][col]==1){
                indexes.add((row-1)+"/"+(col+1));
            }
        }
        display(landscape);
    }

    private static void display(int[][] landscape) {
        for (int i = 0; i < landscape.length; i++) {
            for (int j = 0; j < landscape.length; j++) {
                if(landscape[i][j]==2){
                    System.out.print(1 + " ");
                }
                else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}