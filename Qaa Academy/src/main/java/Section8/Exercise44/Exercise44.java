package Section8.Exercise44;

public class Exercise44 {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("123456789");
        phone.addNewContact(new Contact("John","555555555"));
        phone.addNewContact(new Contact("Steve","666666666"));
        phone.addNewContact(new Contact("John","555555555"));
        phone.printContacts();
        phone.removeContact(new Contact("John","555555555"));
        phone.printContacts();
        phone.updateContact(new Contact("Steve","666666666"),new Contact("John","555555555"));
        phone.printContacts();
    }
}
