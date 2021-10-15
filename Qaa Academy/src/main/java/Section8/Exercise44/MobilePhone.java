package Section8.Exercise44;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts= new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        int index=findContact(contact);
        if (index<0) return myContacts.add(contact);
        else return false;
    }

    public boolean updateContact(Contact oldContact, Contact updatedContact){
        int index=findContact(oldContact);
        if (index<0) return false;
        else {
            myContacts.set(index,updatedContact);
            return true;
        }
    }

    public boolean removeContact(Contact contactToRemove){
        int index=findContact(contactToRemove);
        if (index<0) return false;
        else {
            myContacts.remove(index);
            return true;
        }
    }

    private int findContact(Contact contact){
        for(Contact e: myContacts){
            if (e.getName()==contact.getName() && e.getPhoneNumber()== contact.getPhoneNumber()){
                return myContacts.indexOf(e);
            }
        }
        return -1;
    }

    private int findContact(String name){
        for(Contact e: myContacts){
            if (e.getName()==name){
                return myContacts.indexOf(e);
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        for(Contact e: myContacts){
            if (e.getName()==name){
                return e;
            }
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(Contact e: myContacts){
            System.out.println(e.getName()+ " -> "+ e.getPhoneNumber());
        }
    }
}
