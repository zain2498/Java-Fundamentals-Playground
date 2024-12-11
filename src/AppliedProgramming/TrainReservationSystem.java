package AppliedProgramming;

import java.util.Scanner;

public class TrainReservationSystem {
    TrainCoach head = null;
    TrainCoach tail = null;

    static class TrainCoach {
        String coachNumber;
        int capacity;
        int availableSeats;
        TrainCoach next;
        TrainCoach prev;

        public TrainCoach(String coachNumber, int capacity, int availableSeats) {
            this.coachNumber = coachNumber;
            this.capacity = capacity;
            this.availableSeats = availableSeats;
            this.next = null;
            this.prev = null;
        }
    }

    public void addCoach(String coachNumber, int capacity, int availableSeats) {
        TrainCoach trainCoach = new TrainCoach(coachNumber, capacity, availableSeats);
        if (head == null) {
            head = trainCoach;
            tail = trainCoach;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = trainCoach;
            trainCoach.prev = tail;
            tail = trainCoach;
            trainCoach.next = null;
        }
    }

    public void removeTrainCoach(String coachNumber) {
        TrainCoach currCoach = head;
        if (currCoach == null) {
            System.out.println("There is no coach available in the train");
            return;
        }
        while (currCoach != null) {
            if (currCoach.coachNumber.equalsIgnoreCase(coachNumber)) {
                if (currCoach == head) {
                    head = head.next;
                    System.out.println("coach is removed from the front " + currCoach.coachNumber);
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (currCoach == tail) {
                    tail = tail.prev;
                    System.out.println("coach is removed from the last " + currCoach.coachNumber);
                    if (tail != null) {
                        tail.next = null;
                    }
                } else {
                    head.next.prev = currCoach.next;
                    tail.prev.next = currCoach.prev;
                    System.out.println("coach is removed from in between " + currCoach.coachNumber);
                }
            }
            currCoach = currCoach.next;
        }
    }

    public void reserveSeats(String coachNumber, int seats){
        TrainCoach currCoach = head;
        if (currCoach == null) {
            System.out.println("There is no coach available in the train");
            return;
        }

        while (currCoach!=null){
            if (currCoach.coachNumber.equalsIgnoreCase(coachNumber)){
                if (seats <= currCoach.availableSeats){
                    currCoach.availableSeats = currCoach.availableSeats - seats;
                    System.out.println("Congrats!!! Your number of seats: "+seats + " are reserved in the following train with coach number: "+coachNumber);
                    System.out.println("The available seats are left in train following coach number : " +coachNumber +"  are: "+currCoach.availableSeats);
                }else {
                    System.out.println("We are extremely sorry,The number of seats: "+seats +" you requested to reserve is not available in train coach number: "+coachNumber);
                }
            }
            currCoach = currCoach.next;
        }
    }

    public void cancelReservation(String coachNumber, int seats){
        TrainCoach currCoach = head;
        if (currCoach == null) {
            System.out.println("There is no coach available in the train");
            return;
        }
        while (currCoach!=null){
            if(currCoach.coachNumber.equalsIgnoreCase(coachNumber)){
                if (currCoach.capacity>= currCoach.availableSeats + seats){
                    currCoach.availableSeats = currCoach.availableSeats + seats;
                    System.out.println("Dear Customer! Your request to cancel the reservation of seats is completed and the number of seats: "+ seats + " in the following train coach number: "+ coachNumber+" is cancelled.");
                    System.out.println("The available seats in train are: "+currCoach.availableSeats);
                }else {
                    System.out.println("Sorry Sir!!! We are unable to process your request at this moment,Please try again later,Thanks for understanding.");
                }
            }
            currCoach = currCoach.next;
        }

    }

    public void displayAllTrainCoaches() {
        TrainCoach currCoach = head;
        if (currCoach == null) {
            System.out.println("There is no coach available in the train");
            return;
        }
       // System.out.println("Below are the available train coaches:");
        while (currCoach != null) {
            System.out.println("Coach-Number: " + currCoach.coachNumber + ", Capacity: " + currCoach.capacity + ", Available-Seats: " + currCoach.availableSeats);
            currCoach = currCoach.next;
        }

    }

    public void displayAllTrainCoachesInReverseOrder(){
        TrainCoach currCoach = tail;
        if(currCoach == null){
            System.out.println("There is no coach available in the train");
            return;
        }

        while (currCoach!=null){
            System.out.println("Coach-Number: " + currCoach.coachNumber + ", Capacity: " + currCoach.capacity + ", Available-Seats: " + currCoach.availableSeats);
            currCoach = currCoach.prev;
        }
    }
    public static void main(String[] args) {
        Scanner inputScanner = null;
        TrainReservationSystem trainReservationSystem = null;
        String coachNumber="";
        int capacity=0;
        int avaSeats=0;
        try{
            trainReservationSystem = new TrainReservationSystem();
            trainReservationSystem.addCoach("abc123", 14, 6);
            trainReservationSystem.addCoach("abc987", 12, 10);
             inputScanner = new Scanner(System.in);
            boolean isRunning = true;
            boolean isApplicable = false;
            while(isRunning){
                System.out.println("\nPlease choose the option below:");
                System.out.println("Press 1 to add a new coach");
                System.out.println("Press 2 to remove a new coach");
                System.out.println("Press 3 to display all coaches (forward and reverse)");
                System.out.println("Press 4 to reserve a seats in a specific coach");
                System.out.println("Press 5 to cancel seat reservation in a specific coach");
                System.out.println("Press 0 to exit the program");
                int usrChoice = inputScanner.nextInt();
                switch (usrChoice){
                    case 1:
                        System.out.println("Please enter a coach number");
                        coachNumber = inputScanner.next();
                        while (!isApplicable){
                            System.out.println("Please enter capacity");
                            capacity = inputScanner.nextInt();
                            System.out.println("Please enter available seats");
                            avaSeats = inputScanner.nextInt();

                            isApplicable = validateUserRequest(capacity,avaSeats);
                        }
                        if (isApplicable){
                            trainReservationSystem.addCoach(coachNumber,capacity,avaSeats);
                        }
                        break;
                    case 2:
                        System.out.println("Please enter a coach number");
                        coachNumber = inputScanner.next();
                        trainReservationSystem.removeTrainCoach(coachNumber);
                        break;
                    case 3:
                        System.out.println("\nAvailable train coaches in forward order:");
                        trainReservationSystem.displayAllTrainCoaches();
                        System.out.println("\nAvailable train coaches in reverse order:");
                        trainReservationSystem.displayAllTrainCoachesInReverseOrder();
                        break;
                    case 4:
                        System.out.println("For seats reservation: Please enter the coach number you want to reserve a seat");
                        coachNumber = inputScanner.next();
                        System.out.println("Please enter the number of seats you want to reserve");
                        avaSeats = inputScanner.nextInt();
                        trainReservationSystem.reserveSeats(coachNumber,avaSeats);
                        break;
                    case 5:
                        System.out.println("For cancellation of seats: we need the following details, Please cooperate");
                        System.out.println("Please provide us the coach number ");
                        coachNumber = inputScanner.next();
                        System.out.println("Please tell us how many seats you want to cancelled");
                        avaSeats = inputScanner.nextInt();
                        trainReservationSystem.cancelReservation(coachNumber,avaSeats);
                        break;
                    case 0:
                        isRunning = false;
                        System.out.println("Thank you for using our system. BYE!!!");
                        break;
                    default:
                        break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            inputScanner.close();
        }
    }

    private static boolean validateUserRequest(int capacity, int avaSeats) {

        if(capacity < avaSeats){
            System.out.println("Sorry !!! You cannot add more seats than the capacity in train coach.");
            return false;
        }

        return true;
    }
}
