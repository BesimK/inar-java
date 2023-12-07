package QA.week_11.additionalClasses;

public class Student extends Person{
    public final int classStatus;

    public Student(String name, String address, String phoneNumber, String eMailAddress, int classStatus) {
        super(name, address, phoneNumber, eMailAddress);
        this.classStatus = classStatus;
    }
    @Override
    public String toString() {
        return "\t-Student-\n" +
                "Name: " + name + '\n' +
                "Address: " + address + '\n' +
                "Phone Number: " + phoneNumber + '\n' +
                "Email Address: " + eMailAddress +'\n' +
                "Class Status: " + classStatus;
    }
}
