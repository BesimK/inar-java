package QA.week_11.additionalClasses;

public class Faculty extends Employee{
    public String officeHours;
    public String rank;

    public Faculty(String name, String address, String phoneNumber, String eMailAddress, String office, String salary, String officeHours, String rank) {
        super(name, address, phoneNumber, eMailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    @Override
    public String toString() {
        return "\t-Faculty-\n" +
                "Name: " + name + '\n' +
                "Address: " + address + '\n' +
                "Phone Number: " + phoneNumber + '\n' +
                "Email Address: " + eMailAddress +'\n' +
                "Office Hours: " + officeHours + '\n' +
                "Rank: " + rank;
    }
}
