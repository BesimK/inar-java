package QA.week_12.additionalClasses;

public class BinaryFormatException extends Exception{
        public BinaryFormatException(String binary) {
            super("Invalid Binary String: " + binary);
        }
}
