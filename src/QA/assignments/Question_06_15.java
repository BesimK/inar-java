package QA.assignments;

public class Question_06_15 {
    public static void main(String[] args) {
        System.out.println("Taxable\t\t\tSingle\t\t\tMarried Joint  \tMarried  \tHead of");
        System.out.println("Income\t\t\t\t\t\t\tor Qualifying\t\tSeparate\ta House");
        System.out.println("\t\t\t\t\t\t\t\tWidow(er)\t\t\t\t\t\t\t\t\t");
        System.out.println("-----------------------------------------------------------------");
        for (int i = 50000; i <=60000 ; i+=50) {
            System.out.print(i + "\t\t\t");
            System.out.print(Math.round(computeTax(0,i)) + "\t\t\t");
            System.out.print(Math.round(computeTax(1,i))+ "\t\t\t");
            System.out.print(Math.round(computeTax(2,i))+ "\t\t\t");
            System.out.print(Math.round(computeTax(3,i))+ "\t\t\t");
            System.out.println();
        }
    }
    public static double computeTax(int status,double taxableIncome){
        if (status==0){
            return (8350.0/100*10)+((33950-8350)/100.0*15)+((taxableIncome-33950.0)/100*25);
        }
        else if (status==1){
            return (16700.0/100*10)+((taxableIncome-16700)/100.0*15);
        }
        else if (status==2){
            return (8350.0/100*10)+((33950-8350)/100.0*15)+((taxableIncome-33950.0)/100*25);
        }
        else {
            return (11950.0/100*10)+((45500-11950.0)/100.0*15)+((taxableIncome-45500)/100*25);
        }


    }
}
