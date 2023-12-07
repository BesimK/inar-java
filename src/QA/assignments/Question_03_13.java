package QA.assignments;

import java.util.Scanner;

public class Question_03_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("0-single filter, 1-married jointly or qualifying widow(er)," +
                " 2- married separately, 3-head of household) Enter filing status: ");
        int filing = input.nextInt();
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();
        double tax;
        switch (filing){
            case 0 :
                if (income <= 8350){
                    tax = income / 10;
                } else if (income <= 33950) {
                    tax = ( 8350.0 / 10 ) + ((income - 8350)/100 * 15);
                } else if (income <= 82250) {
                    tax = ( 8350.0 / 10 ) + ((33950.0 - 8350)/100 * 15) + ((income - 33950.0)/100*25);
                } else if (income <= 171550) {
                    tax = ( 8350.0 / 10 ) + ((33950.0 - 8350)/100 * 15) + ((82250 - 33950.0)/100*25) + ((income - 82250.0) / 100 * 28);
                } else if (income <= 372950) {
                    tax = ( 8350.0 / 10 ) + ((33950.0 - 8350)/100 * 15) + ((82250 - 33950.0)/100*25) +
                            ((171550 - 82250.0) / 100 * 28) + ((income - 171550 )/100 * 33);
                }else{
                    tax = ( 8350.0 / 10 ) + ((33950.0 - 8350)/100 * 15) +
                            ((82250 - 33950.0)/100*25) + ((171550 - 82250.0) / 100 * 28) +
                            ((372950.0 - 171550 )/100 * 33) + ((income - 372950.0) / 100 * 35);
                }
                System.out.println("Tax is " + tax);
                break;
            case 1 :
                if (income <= 16700){
                    tax = income / 10;
                } else if (income <= 67900) {
                    tax = ( 16700.0 / 10 ) + ((income - 16700)/100 * 15);
                } else if (income <= 137050) {
                    tax = ( 16700.0 / 10 ) + ((67900.0 - 16700)/100 * 15) + ((income - 67900.0)/100*25);
                } else if (income <= 208850) {
                    tax = ( 16700.0 / 10 ) + ((67900.0 - 16700)/100 * 15) + ((137050 - 67900.0)/100*25) + ((income - 137050.0) / 100 * 28);
                } else if (income <= 372950) {
                    tax = ( 16700.0 / 10 ) + ((67900.0 - 16700)/100 * 15) + ((137050 - 67900.0)/100*25) +
                            ((208850 - 137050.0) / 100 * 28) + ((income - 208850.0 )/100 * 33);
                }else{
                    tax = ( 16700.0 / 10 ) + ((67900.0 - 16700.0)/100 * 15) +
                            ((137050 - 67900.0)/100*25) + ((208850 - 137050.0) / 100 * 28) +
                            ((372950.0 - 208850 )/100 * 33) + ((income - 372950.0) / 100 * 35);
                }
                System.out.println("Tax is " + tax);
                break;
            case 2 :
                if (income <= 8350){
                    tax = income / 10;
                } else if (income <= 33950) {
                    tax = ( 8350.0 / 10 ) + ((income - 8350)/100 * 15);
                } else if (income <= 68525) {
                    tax = ( 8350.0 / 10 ) + ((33950.0 - 8350)/100 * 15) + ((income - 33950.0)/100*25);
                } else if (income <= 104425) {
                    tax = ( 8350.0 / 10 ) + ((33950.0 - 8350)/100 * 15) +
                            ((68525.0 - 33950.0)/100*25) + ((income - 68525.0) / 100 * 28);
                } else if (income <= 186475) {
                    tax = ( 8350.0 / 10 ) + ((33950.0 - 8350)/100 * 15) +
                            ((68525 - 33950.0)/100*25) +
                            ((104425.0 - 68525.0) / 100 * 28) + ((income - 104425.0 )/100 * 33);
                }else{
                    tax = ( 8350.0 / 10 ) + ((33950.0 - 8350)/100 * 15) +
                            ((68525 - 33950.0)/100*25) +
                            ((104425.0 - 68525.0) / 100 * 28) + ((186475 - 104425.0 )/100 * 33)
                            + ((income - 186475.0) /100 * 35);
                }
                System.out.println("Tax is " + tax);
                break;
            case 3 :
                if (income <= 11950){
                    tax = income / 10;
                } else if (income <= 45500) {
                    tax = ( 11950.0 / 10 ) + ((income - 11950.0)/100 * 15);
                } else if (income <= 117450) {
                    tax = ( 11950.0 / 10 ) + ((45500.0 - 11950)/100 * 15) + ((income - 45500.0)/100*25);
                } else if (income <= 190200) {
                    tax = ( 11950.0 / 10 ) + ((45500.0 - 11950)/100 * 15) + ((117450 - 45500.0)/100*25)
                            + ((income - 117450.0) / 100 * 28 );
                } else if (income <= 372950) {
                    tax = ( 11950.0 / 10 ) + ((45500.0 - 11950)/100 * 15) + ((117450 - 45500.0)/100*25)
                            + ((190200 - 117450.0) / 100 * 28 ) + ((income - 190200) / 100 * 33 );
                }else{
                    tax = ( 11950.0 / 10 ) + ((45500.0 - 11950)/100 * 15) + ((117450 - 45500.0)/100*25)
                            + ((190200 - 117450.0) / 100 * 28 ) + ((372950.0 - 190200) / 100 * 33 )
                            + ((income - 372950.0) / 100 * 35 );
                }
                System.out.println("Tax is " + tax);
                break;
        }
    }
}
