package QA.interview;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        String pathName = "C:\\Users\\BESIM\\workspace\\inar-java\\src\\QA.ChangeNames\\CheckerTest\\Question322_322";
        File file = new File(pathName);
        System.out.println(file.getName().matches("Question\\d+_\\d+"));
    }
}


