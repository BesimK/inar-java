package QA.week_11.additionalClasses;

public class Staff extends Employee{
    public String title;

    public Staff(String name, String address, String phoneNumber, String eMailAddress, String office, String salary, String title) {
        super(name, address, phoneNumber, eMailAddress, office, salary);
        this.title = title;
    }
    @Override
    public String toString() {
        return "\t-Staff-\n" +
                "Name: " + name + '\n' +
                "Address: " + address + '\n' +
                "Phone Number: " + phoneNumber + '\n' +
                "Email Address: " + eMailAddress +'\n' +
                "Office: " + office + '\n' +
                "Salary: " + salary + '\n' +
                "Date Hired: " + dateHired.toString() + '\n' +
                "Title: " + title;

    }
}
