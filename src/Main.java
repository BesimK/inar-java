import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "abbacabaacc";
        s=sort(s);
        System.out.println(s);
    }
    private static String sort(String s){
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if(arr[i]>arr[j]){
                    char temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return Arrays.toString(arr);
    }
}