package QA.week_14.Question_14_18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ContactManager {
    private HashMap<String,String> contacts;
    public ContactManager(){
        contacts = new HashMap<>();
    }
    public void addContact(String name, String phoneNumber){
        contacts.put(name, phoneNumber);
    }
    public String searchByName(String name){
        for (Map.Entry<String,String> m : contacts.entrySet()){
            if(m.getKey().equalsIgnoreCase(name)){
                return m.getValue();
            }
        }
        return null;
    }
    public String searchByPhoneNumber(String tel){
        for (Map.Entry<String,String> m : contacts.entrySet()){
            if(m.getValue().equalsIgnoreCase(tel)){
                return m.getKey();
            }
        }
        return null;
    }
}
