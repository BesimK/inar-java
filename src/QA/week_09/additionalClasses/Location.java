package QA.week_09.additionalClasses;

public class Location {
    private int row;
    private int column;
    private double maxValue;
    public Location(int row,int column, double maxValue){
        this.row=row;
        this.column=column;
        this.maxValue=maxValue;

    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public static Location locateLargest(double[][] array){
        int rowMax=0;
        int colMax=0;
        double maxValue=array[0][0];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if(array[row][col]>maxValue){
                    maxValue=array[row][col];
                    rowMax=row;
                    colMax=col;
                }
            }
        }
        return new Location(rowMax,colMax,maxValue);
    }
}
