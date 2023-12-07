package QA.week_11.additionalClasses;
import QA.week_10.additionalClasses.MyDate;
public class Employee extends Person{
    public String office;
    public String salary;
    public MyDate dateHired = new MyDate();

    public Employee() {
    }

    public Employee(String name, String address, String phoneNumber, String eMailAddress, String office, String salary) {
        super(name, address, phoneNumber, eMailAddress);
        this.office = office;
        this.salary = salary;

    }
    @Override
    public String toString() {
        return "\t-Employee-\n" +
                "Name: " + name + '\n' +
                "Address: " + address + '\n' +
                "Phone Number: " + phoneNumber + '\n' +
                "Email Address: " + eMailAddress +'\n' +
                "Office: " + office + '\n' +
                "Salary: " + salary + '\n' +
                "Hired Date: " + dateHired.toString();
    }
}
