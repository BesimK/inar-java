package QA.week_12.assignments;

public class Question_12_10 {
    public static void main(String[] args) {
        try {
            outOfMemory();
        }catch (OutOfMemoryError error){
            System.out.println("Caught OutOfMemoryError: " + error.getMessage());
        }
    }

    private static void outOfMemory() {
        int size = Integer.MAX_VALUE;
        try {
            int[] array = new int[size];
        }catch (OutOfMemoryError error){
            throw new OutOfMemoryError("Bruh!");
        }
    }
}
