Contact List Manager

Overview

The Contact List Manager is a Java-based console application that allows users to manage a contact list. It provides features such as adding, searching, deleting, and displaying contact details. This project demonstrates the use of object-oriented programming concepts like classes, linked lists, and encapsulation in Java.

Features

Add a Contact

Add a new contact with a unique name, email, and phone number.

Validates input formats for name, email, and phone number.

Search for a Contact

Search for a contact by name and display their details if found.

Display All Contacts

Display all the contacts in the contact list.

Delete a Contact

Remove a contact by name.

Validation

Ensures that no duplicate names, email addresses, or phone numbers are added.

Validates email format and phone number format (11 digits).

User-Friendly Menu

Provides a menu-driven interface for ease of use.

Prerequisites

Java Development Kit (JDK) 8 or later.

Any Java IDE or text editor (e.g., IntelliJ IDEA, Eclipse, VS Code).

Basic understanding of Java programming.

How to Run

Clone or download the project files to your local system.

Open the project in your Java IDE.

Compile and run the ContactListManager class.

Follow the on-screen menu to perform operations on the contact list.

Program Structure

Contact Class

The Contact class represents a single contact with the following attributes:

name: The contact's name.

email: The contact's email address.

phoneNumber: The contact's phone number.

next: A reference to the next contact in the linked list.

ContactListManager Class

This class manages the contact list using a singly linked list and provides the following methods:

addContact(String name, String email, String phoneNumber): Adds a new contact to the list.

isNameExists(String name): Checks if a contact with the given name exists.

isPhoneNumberExists(String phoneNumber): Checks if a contact with the given phone number exists.

isEmailExists(String email): Checks if a contact with the given email exists.

searchContact(String name): Searches for a contact by name.

displayAllContacts(): Displays all contacts.

deleteContact(String name): Deletes a contact by name.

Main Method

The main method provides a menu-driven interface that allows the user to interact with the contact list. The user can perform the following operations:

Display all contacts.

Search for a contact.

Add a new contact.

Remove a contact.

Exit the program.

Input Validation

Name: Must contain only letters and spaces.

Email: Must follow a standard email format (e.g., example@example.com).

Phone Number: Must contain exactly 11 digits.

Example Usage

Please choose the operation you want to perform.
1. Display all contacts
2. Search for contact
3. Add a new contact
4. Remove a contact
5. Exit
Enter your choice: 3
Please enter a contact name: Zain
Please enter an email: zain@gmail.com
Please enter a contact number: 03321478569
Contact added successfully!

Future Improvements

Add support for updating existing contact details.

Implement persistent storage using files or a database.

Enhance the UI for better user experience.

License

This project is for educational purposes and is not licensed for commercial use. Feel free to modify and extend it for personal learning.

Author

Zain Badaruddin