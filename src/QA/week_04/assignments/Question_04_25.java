package QA.week_04.assignments;

public class Question_04_25 {
    public static void main(String[] args) {

        char firstLetter = (char) (Math.random() * (90 - 65) + 65);

        char secondLetter = (char) (Math.random() * (90 - 65) + 65);

        char thirdLetter = (char) (Math.random() * (90 - 65) + 65);



        int digitPartOfPlateNumber = (int) (Math.random() * (10000 - 1000) + 1000);



        String letterPartOfPlateNumber = "" + firstLetter + secondLetter + thirdLetter;

        String stringOfDigitPartOfPlateNumber = "" + digitPartOfPlateNumber;

        String plateNumber = (letterPartOfPlateNumber.concat(stringOfDigitPartOfPlateNumber)).replaceAll("\\s+", "");


        System.out.println("Generated plate number :" + plateNumber);
    }
}
