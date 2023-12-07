package QA.assignments;

public class Question_04_25 {
    public static void main(String[] args) {


        char firstCharacter =(char)((int)(65+(Math.random()*26)));
        char secondCharacter = (char)((int)(65+(Math.random()*26)));
        char thirdCharacter = (char)((int)(65+(Math.random()*26)));
        char fourthCharacter = (char)((int)(48+(Math.random()*10)));
        char fifthCharacter = (char)((int)(48+(Math.random()*10)));
        char sixthCharacter = (char)((int)(48+(Math.random()*10)));
        char seventhCharacter = (char)((int)(48+(Math.random()*10)));

        System.out.println("Generated plate number: " + firstCharacter + secondCharacter + thirdCharacter +
                fourthCharacter + fifthCharacter + sixthCharacter + seventhCharacter);
    }
}
