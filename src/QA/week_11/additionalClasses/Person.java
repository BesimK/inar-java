package QA.week_11.additionalClasses;

public class Person {
    public String name;
    public String address;
    public String phoneNumber;
    public String eMailAddress;

    public Person() {
    }

    public Person(String name, String address, String phoneNumber, String eMailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.eMailAddress = eMailAddress;
    }

    @Override
    public String toString() {
        return "\t-Person-\n" +
                "Name: " + name + '\n' +
                "Address: " + address + '\n' +
                "Phone Number: " + phoneNumber + '\n' +
                "Email Address: " + eMailAddress;
    }
}
