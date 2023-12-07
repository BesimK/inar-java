package QA.week_10.additionalClasses;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inches;

    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

    @Override
    public String toString() {
        return "Name:  " + name +
                "\nBMI:  " + BMIComputer();
    }

    public String BMIComputer() {
        double bmi = 703*(weight/(Math.pow((feet*12+inches),2)));
        if(bmi>25){
            return bmi + " Overweight";
        }
        else if (bmi>18.5){
            return bmi + " Normal";
        }
        else return bmi + " Underweight";
    }
}
