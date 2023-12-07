package QA.week_10.assignments;

import QA.week_10.additionalClasses.MyCharacter;

public class Question_10_24 {
    public static void main(String[] args) {
        MyCharacter a = new MyCharacter('a');
        System.out.println(a);
        MyCharacter b = new MyCharacter('z');
        System.out.println(b);
        System.out.println(MyCharacter.compareTo('z', 'a'));

        // THE OUTPUT IS NOT CLEAR!!

    }
}