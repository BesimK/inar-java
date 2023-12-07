package QA.week_14.Question_14_18;

public class Question_14_18 {
    public static void main(String[] args) {
    ContactManager contactManager = new ContactManager();
        contactManager.addContact("Besim Karabıyık", "1");
        contactManager.addContact("John Wick", "2");
        contactManager.addContact("Neo Matrix", "3");
        contactManager.addContact("Morpheus Zyon", "4");
        contactManager.addContact("Trinity Onflame", "5");
        System.out.println(contactManager.searchByName("Besim Karabıyık"));
        System.out.println(contactManager.searchByName("Trinity Onflame"));
        System.out.println(contactManager.searchByPhoneNumber("4"));
        System.out.println(contactManager.searchByPhoneNumber("2"));
    }
}
