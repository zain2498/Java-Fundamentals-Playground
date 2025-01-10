package AppliedProgramming;

import java.security.cert.CertPath;
import java.util.Scanner;

public class ContactListManager {

    class Contact {
        String contactName;
        String emailAddress;
        String contactNumber;
        Contact nextContact;
        Contact prevContact;

        Contact(String name, String email, String phoneNumber) {
            this.contactName = name;
            this.emailAddress = email;
            this.contactNumber = phoneNumber;
            nextContact = null;
            prevContact = null;
        }
    }

    private Contact firstContact = null;
    private Contact lastContact = null;

    public void addContact(String name, String email, String phone) {
        Contact createContact = new Contact(name, email, phone);
        if (firstContact == null) {
            firstContact = createContact;
            lastContact = createContact;
            System.out.println("Your first contact is successfully added");
            return;
        } else {
            lastContact.nextContact = createContact;
            lastContact = createContact;
        }
        System.out.println("Your contact details are successfully added");
    }

    public void searchContact(String name) {
        if (firstContact == null) {
            System.out.println("Your contact list is empty");
            return;
        }
        Contact currentContact = firstContact;
        while (currentContact != null) {
            if (currentContact.contactName.equalsIgnoreCase(name)) {
                System.out.println("Your contact is found below are the contact details:");
                System.out.println("Contact Name : " + currentContact.contactName);
                System.out.println("Contact Email Address : " + currentContact.emailAddress);
                System.out.println("Contact Phone Number : " + currentContact.contactNumber);
            }
            currentContact = currentContact.nextContact;
        }
    }

    public void displayAllContacts() {
        Contact currContact = firstContact;
        System.out.println("Contact list is shown below: ");
        while (currContact != null) {
            System.out.print("Contact Name: " + currContact.contactName + ", Email Address: " + currContact.emailAddress + ", Contact Number: " + currContact.contactNumber);
            System.out.println();
            currContact = currContact.nextContact;
        }
    }

    public void deleteContact(String name) {
        if (firstContact == null) {
            System.out.println("Sorry bro! Your contact list is empty");
            return;
        }

        Contact currentContact = firstContact;
        Contact prevContact = null;
        if (firstContact.contactName.equalsIgnoreCase(name)) {
            System.out.println("This is your first contact in the list which has been deleted.");
            System.out.println("Contact Name " + firstContact.contactName);
            firstContact = currentContact.nextContact;
            return;
        }

        while (currentContact != null) {
            if (currentContact.contactName.equalsIgnoreCase(name)){
                if (currentContact == lastContact) {
                    System.out.println("Your last contact is successfully deleted from the list");
                    System.out.println("Contact Name " + lastContact.contactName);
                    lastContact = prevContact;
                    if (lastContact != null) {
                        lastContact.nextContact = null;
                    }
                }else {
                    System.out.println("Your contact is successfully deleted within your contact list");
                    System.out.println("Contact Name "+currentContact.contactName);
                    if (prevContact!=null){
                        prevContact.nextContact = currentContact.nextContact;
                    }
                }
                return;
            }
            prevContact = currentContact;
            currentContact = currentContact.nextContact;
        }
        System.out.println("The contact "+name + " you are trying to delete is not found in the list.");
    }

    public boolean isNameExists(String name) {
        Contact currentContact = firstContact;
        while (currentContact != null) {
            if (currentContact.contactName.equalsIgnoreCase(name)) {
                System.out.println("Please add a unique contact name");
                return true;
            }
            currentContact = currentContact.nextContact;
        }
        return false;
    }

    public boolean isPhoneNumberExists(String phone) {
        Contact currentContact = firstContact;
        while (currentContact != null) {
            if (currentContact.contactNumber.equalsIgnoreCase(phone)) {
                System.out.println("Please add a unique phone number this number is already exist in your list");
                return true;
            }
            currentContact = currentContact.nextContact;
        }
        return false;
    }

    public boolean isEmailExists(String email) {
        Contact currentContact = firstContact;
        while (currentContact != null) {
            if (currentContact.emailAddress.equalsIgnoreCase(email)) {
                System.out.println("Please add a unique email address as this email already present in your contact list");
                return true;
            }
            currentContact = currentContact.nextContact;
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        ContactListManager contactListManager = new ContactListManager();
        contactListManager.addContact("zain", "zain@gmail.com", "03321478569");
        contactListManager.addContact("navaid", "navaid@gmail.com", "03321478328");
        contactListManager.addContact("sohaib", "sohaib@gmail.com", "03321478457");
        contactListManager.addContact("ali", "ali@gmail.com", "03321478656");
        // contactListManager.displayContact();

        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        String name, pNumber, email;
        boolean isExist = false;
        int userChoice;
        while (flag) {
            System.out.println("\nPlease choose the operation you want to perform.");
            System.out.println("To display contact details press 1: ");
            System.out.println("To search for contact press 2: ");
            System.out.println("To add a new contact press 3: ");
            System.out.println("To remove a contact press 4: ");
            System.out.println("for exit press 5:");
            userChoice = sc.nextInt();
            switch (userChoice) {
                case 1:
                    contactListManager.displayAllContacts();
                    break;
                case 2:
                    System.out.println("Please enter a name to search");
                    name = sc.next();
                    contactListManager.searchContact(name);
                    break;
                case 3:
                    while (true) {
                        System.out.println("Please enter a contact name:");
                        name = sc.next();
                        if (name.matches("[A-Za-z ]+")) {
                            isExist = contactListManager.isNameExists(name);
                            if (!isExist) {
                                break;
                            }

                        } else {
                            System.out.println("Invalid name. Only letters and spaces are allowed.");
                        }
                    }
                    while (true) {
                        System.out.println("Please enter an email:");
                        email = sc.next();
                        if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                            isExist = contactListManager.isEmailExists(email);
                            if (!isExist) {
                                break;
                            }
                        } else {
                            System.out.println("Invalid email. Please enter a valid email address.");
                        }
                    }

                    while (true) {
                        System.out.println("Please enter a contact number:");
                        pNumber = sc.next();
                        if (pNumber.matches("\\d{11}")) {
                            isExist = contactListManager.isPhoneNumberExists(pNumber);
                            if (!isExist) {
                                break;
                            }
                        } else {
                            System.out.println("Invalid phone number. Please enter exactly 11 digits.");
                        }
                    }
                    contactListManager.addContact(name, email, pNumber);
                    break;
                case 4:
                    System.out.println("Please enter a contact name you want to delete");
                    name = sc.next();
                    contactListManager.deleteContact(name);
                    break;
                case 5:
                    flag = false;
                    System.out.println("Exiting good bye!!!");
                    break;
                default:
                    break;
            }
        }
    }

}
