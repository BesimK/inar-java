package QA.week_12.assignments;

public class Question_12_01 {
    public static void main(String[] args) {

        if (checkInput(args)) { // Check for non-numeric operands in args[]
            int result = 0;
            switch (args[1].charAt(0)) {
                case '+' -> result = Integer.parseInt(args[0]) +
                        Integer.parseInt(args[2]);
                case '-' -> result = Integer.parseInt(args[0]) -
                        Integer.parseInt(args[2]);
                case '.' -> result = Integer.parseInt(args[0]) *
                        Integer.parseInt(args[2]);
                case '/' -> result = Integer.parseInt(args[0]) /
                        Integer.parseInt(args[2]);
                default -> {
                    System.out.println("Operator must be (+,-,.,/)");
                    System.exit(2);
                }
            }
            ;
            System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                    + " = " + result);
        }
    }
    private static boolean checkInput(String[] args) {
        try {
            Integer.parseInt(args[0]);
        } catch (NumberFormatException ex) {

            System.out.println("Invalid Input: " + args[0]);
            System.exit(10);

        }
        try {
            Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {

            System.out.println("Invalid Input: " + args[2]);
            System.exit(10);
        }
        return true;
    }

}