package QA.week_14.Question_14_11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Question_14_11 {
    private static final String SYMBOLS = "(){}[]";

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String path = input.next();
        String absPath = "C:\\Users\\BESIM\\workspace\\inar-java\\src\\QA\\ChangeNames\\" + path;

        try {

            Stack<Character> symbols = fillStack(absPath);
            boolean isPaired = checkSymbols(symbols);
            String result = "";
            if (isPaired) {
                result += "correct number of pairs";
            } else {
                result += "INCORRECT number of pairs";
            }
            System.out.println("The source-file: " + new File(absPath).getName() + " has " + result);
        } catch (IOException ioException) {
            System.out.println("Something went wrong trying to read the provided file path...");
            ioException.printStackTrace();
        }

    }

    private static Stack<Character> fillStack(String filePath) throws IOException {
        Stack<Character> symbolsStack = new Stack<>();
        Path path = Paths.get(filePath);
        /* Read the whole file as character values */
        List<String> lines = Files.readAllLines(path);

        for (String line : lines) {
            for (char c : line.toCharArray()) {
                if (SYMBOLS.contains(String.valueOf(c))) { // Check if the char is in SYMBOLS
                    symbolsStack.push(c); // Add to stack
                }
            }
        }
        return symbolsStack;
    }

    private static boolean checkSymbols(Stack<Character> stack) {
        Stack<Character> holder = new Stack<>();
        int size = stack.size();
        if (size == 0) return true;
        if (size == 1) return false;
        if (size % 2 != 0) return false; // Must be even for all symbols to have a pair

        while (!stack.isEmpty()) { // Check all symbols in stack
            if (!holder.isEmpty()) {
                if (holder.size() > stack.size()) return false;
                else if (isPair(holder.peek(), stack.peek())) {
                    holder.pop();
                    stack.pop();
                }
                else {
                    holder.push(stack.pop());
                }
            } else {
                Character symbol = stack.pop();
                if (isPair(symbol, stack.peek())) {
                    stack.pop();
                } else {
                    holder.push(symbol);
                }
            }
        }
        return holder.isEmpty();
    }

    static boolean isPair(char ch1, char ch2) {
        return switch (ch1) {
            case '}' -> ch2 == '{';
            case ')' -> ch2 == '(';
            case ']' -> ch2 == '[';
            default -> false;
        };
    }


}
