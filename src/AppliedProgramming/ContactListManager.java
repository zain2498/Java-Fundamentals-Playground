package AppliedProgramming;

import java.util.Scanner;

public class ContactListManager {

    class Contact {
        String name;
        String phoneNumber;
        String email;
        Contact next;

        public Contact(String name, String email, String phoneNumber) {
            this.email = email;
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.next = null;
        }
    }

    public Contact head = null;
    public Contact tail = null;

    public void addContact(String name, String email, String phoneNumber) {
        Contact adContact = new Contact(name, email, phoneNumber);

        if (head == null) {
            head = adContact;
            tail = adContact;
        } else {
            tail.next = adContact;
            tail = adContact;
        }
    }

    public boolean isNameExists(String name) {
        Contact contact = head;

        while (contact != null) {
            if (contact.name.equalsIgnoreCase(name)) {
                System.out.println("there is already contact present with the given name");
                return true;
            }
            contact = contact.next;
        }
        return false;
    }

    public boolean isPhoneNumberExists(String phoneNumber) {
        Contact contact = head;
        while (contact != null) {
            if (contact.phoneNumber.equalsIgnoreCase(phoneNumber)) {
                System.out.println("same number cannot be saved again");
                return true;
            }
            contact = contact.next;
        }
        return false;
    }

    public boolean isEmailExists(String email) {
        Contact contact = head;
        while (contact != null) {
            if (contact.email.equalsIgnoreCase(email)) {
                System.out.println("Please enter a unique email address");
                return true;
            }
            contact = contact.next;
        }
        return false;
    }

    public void searchContact(String name) {
        // System.out.println("Searching for contact... "+name.toUpperCase());
        if (head == null) {
            System.out.println("There is no contact present in your contact list");
            return;
        }
        Contact current = head;
        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {
                System.out.println("Contact details are found! ");
                System.out.println("Name: " + current.name);
                System.out.println("Email: " + current.email);
                System.out.println("Phone Number: " + current.phoneNumber);
                return;
            }
            current = current.next;
        }
        System.out.println("No such contact is found in your list");
    }

    public void displayAllContacts() {
        Contact curr = head;

        if (head == null) {
            System.out.println("Contact list is empty");
            return;
        }
        System.out.println("contact list is below:");
        while (curr != null) {
            System.out.println("name " + curr.name + " email: " + curr.email + " phoneNumber " + curr.phoneNumber);
            curr = curr.next;
        }
    }

    private void deleteContact(String name) {
        if (head == null) {
            System.out.println("Contact list is empty");
            return;
        }

        if (head.name.equalsIgnoreCase(name)) {
            head = head.next;
            System.out.println("contact is deleted from the head");
            return;
        }
        Contact currContact = head;
        Contact prevContact = null;

        while (currContact != null && currContact.name != name) {
            prevContact = currContact;
            currContact = currContact.next;
        }

        if (currContact == null) {
            System.out.println("There is no such contact present in your list");
            return;
        }

        if (tail == currContact) {
            tail = prevContact;
            System.out.println("Contact is deleted from the tail.");
            return;
        }

        System.out.println("Your desired contact is deleted.");
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
