package QA.interview;
import java.util.*;

public class RemoveDublicates {

    public static void main (String[] args){
        String string = "beesiseiseiseimmmsbmisembsmebisemismiiimmmm";
        System.out.println(removeDublicate(string));


    }
    public static String removeDublicate(String string){
        Set<Character> set = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i<string.length();i++){
            Character c = string.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                stringBuilder.append(c);
            }

        }

        return stringBuilder.toString();
    }




}
