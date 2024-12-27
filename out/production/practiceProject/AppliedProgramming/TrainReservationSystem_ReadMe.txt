Train Reservation System

Overview

This is a Java-based train reservation system that enables users to manage train coaches, make seat reservations, and cancel reservations. It uses a doubly linked list to maintain the train coaches, providing robust and scalable handling of the reservation of trains.

Features

Add Train Coach: Creates a new train coach with a specific unique number and capacity and available seats in the coach.

Remove Train Coach: Remove a particular train coach by its coach number.

Show Train Coaches:

Show all train coaches in forward order.

Show all train coaches in reverse order.

Book Seats: Book seats in a particular train coach.

Cancel Booking: Cancel already booked seats in a particular train coach.

Validation: It checks that the number of available seats does not exceed the capacity.

Usage

Add a Coach: Provide the coach number, total capacity, and available seats.

Reserve Seats: Provide the coach number and number of seats to reserve.

Cancel Reservation: Provide the coach number and number of seats to cancel.

View Coaches: Show all coaches in both forward and reverse order to view the current status.

Getting Started

Prerequisites

Java Development Kit (JDK) 8 or later.

IDE or text editor (e.g., IntelliJ IDEA, Eclipse, or VS Code).

Running the Application

Clone the repository or download the source code.

Create and execute the TrainReservationSystem class.

Now follow the prompts displayed on the screen to engage with the system.

Example

This is how the application will look like:

Choose one of the options below
To add a new coach, press 1
To delete a new coach, press 2
To print all coaches in both forward and reverse order, press 3
To reserve seats in a specific coach, press 4
To cancel seat reservation in a specific coach, press 5
To exit the program, press 0

TrainCoach Class:

Represents a train coach with attributes: coachNumber, capacity, availableSeats, next, and prev.

TrainReservationSystem Class:

Manages the list of train coaches and provides operations such as adding, removing, reserving, and canceling reservations.

Main Method:

This method gives the menu-driven interface for the user.

Functionality

Adding a Coach

Add a new coach to the end of the list.

Removing a Coach

Removes the coach from the front, rear, or middle of the list based on the coach number provided.

Seat Reservation

Reserves the specified number of seats in the selected coach if available.

Seat Cancellation

Cancels the specified number of seats in the selected coach if within valid limits.

Displaying Coaches

Lists all coaches and their details in both forward and reverse orders.

Error Handling

Ensures that available seats do not exceed capacity during addition.

Checks for valid coach numbers during reservations and cancellations.

License

This project is for educational purposes only and has no warranty. You may use and modify the code to suit your needs.

Contributing

Contributions are welcome! Please fork the repository and submit a pull request with enhancements or bug fixes.

Author

Developed by Syed Zain Badar. Please feel free to reach out for suggestions or feedback.