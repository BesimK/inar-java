package QA.week_14.Question_14_14;

import java.util.*;

public class Question_14_14 {
    public static void main(String[] args) {
        getWords();
    }

    public static void getWords() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        System.out.println("Enter words (-1 finishes) : ");
        String s = input.next();
        while (!s.equalsIgnoreCase("-1")) {
            words.add(s);
            s = input.next();
        }
        System.out.println("Original List -> " + words);
        repetitionControl(words);
        retouchedList(words);
    }

    private static void repetitionControl(ArrayList<String> words) {
        int counter = words.size();
        Set<String> twister = new HashSet<>(words);
        words = new ArrayList<>(twister);
        if (words.size() != counter) {
            System.out.println("Repetitive word usage!!!");
            System.exit(69);
        }
    }

    public static void retouchedList(ArrayList<String> words) {
        ArrayList<HashSet<String>> anagram = new ArrayList<>();
        HashSet<String> assClap = new HashSet<>();
        while (!words.isEmpty()) {
            assClap = new HashSet<>();
            String starter = words.remove(0);
            assClap.add(starter);
            int n = words.size();
            for (int i = 0; i < n; ++i) {
                if (sort(starter).equals(sort(words.get(i)))) {
                    assClap.add(words.remove(words.indexOf(words.get(i))));
                    n--;
                    i--;
                }
            }
            if (!assClap.isEmpty()) anagram.add(assClap);
        }
        System.out.println(anagram);
    }
    private static String sort(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return Arrays.toString(arr);
    }
}
