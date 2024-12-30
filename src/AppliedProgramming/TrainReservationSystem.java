package AppliedProgramming;

import java.util.Scanner;

public class TrainReservationSystem {

    class TrainCoach{
        String coachNumber;
        int capacity;
        int seats;
        TrainCoach nextCoach;
        TrainCoach prevCoach;
        TrainCoach(String coachNumber, int capacity, int seats){
            this.coachNumber = coachNumber;
            this.capacity = capacity;
            this.seats = seats;
            nextCoach = null;
            prevCoach = null;
        }
    }
    private TrainCoach firstCoach = null;
    private TrainCoach lastCoach = null;
    public void addCoach(String coachNumber, int capacity, int seats){
        TrainCoach newTrainCoach = new TrainCoach(coachNumber, capacity, seats);
        if (firstCoach == null){
            firstCoach = newTrainCoach;
            lastCoach = newTrainCoach;
            firstCoach.prevCoach = null;
            lastCoach.nextCoach= null;
        }else {
            lastCoach.nextCoach = newTrainCoach;
            newTrainCoach.prevCoach = lastCoach;
            lastCoach= newTrainCoach;
            newTrainCoach.nextCoach = null;
        }
        System.out.println("Your train coach is successfully addeed in the list");
    }

    TrainCoach prevTrainCoach = null;
    public void removeTrainCoach(String coachNumber){
        TrainCoach currentTrainCoach= firstCoach;
        if (firstCoach == null){
            System.out.println("There is no train coach in your list");
        }

        while (currentTrainCoach!=null){
         if (currentTrainCoach.coachNumber.equalsIgnoreCase(coachNumber)){
             if (currentTrainCoach == firstCoach){
                 firstCoach = currentTrainCoach.nextCoach;
                 System.out.println("Your requested train coach is the first coach is removed from the list. "+coachNumber);
                 if (firstCoach!=null){
                     firstCoach.prevCoach = null;
                 }
                 break;
             } else if (currentTrainCoach == lastCoach) {
                 lastCoach = currentTrainCoach.prevCoach;
                 System.out.println("Your requested train coach is the last coach is removed from the list. "+coachNumber);
                 if (lastCoach!=null){
                     lastCoach.nextCoach = null;
                 }
                 break;
             }else {
                 System.out.println("Your requested train coach is removed within the list. "+coachNumber);
                 prevTrainCoach.nextCoach = currentTrainCoach.nextCoach;
                 currentTrainCoach = currentTrainCoach.nextCoach;
                 currentTrainCoach.prevCoach = prevTrainCoach;
             }
             return;
         }
         prevTrainCoach = currentTrainCoach;
         currentTrainCoach = currentTrainCoach.nextCoach;
        }
        System.out.println("Your requested train coach is not present in our list.");
    }

    public int reserveSeats(String coachNumber, int seats){
        TrainCoach currentCoach = firstCoach;
        if (firstCoach== null){
            System.out.println("List of coach is empty");
            return -1;
        }
        while (currentCoach!= null){
            if (currentCoach.coachNumber.equalsIgnoreCase(coachNumber)){
                if (currentCoach.seats >= seats){
                    System.out.println("Your seats: " + seats + " is reserved against this coach number: "+coachNumber);
                    currentCoach.seats = currentCoach.seats- seats;
                    System.out.println("now the available seat counts are "+ currentCoach.seats);
                    return 0;
                }else {
                    System.out.println("The requested seats are more than the available seats so we cannot proceed with your seats reservation, Please try again!");
                }
            }
            currentCoach = currentCoach.nextCoach;
        }
        return 1;
    }

    public void cancelReservation(String coachNumber, int seats){
        TrainCoach currentCoach = firstCoach;
        if (currentCoach == null){
            System.out.println("The train has no coach present at the moment, Sorry!!!");
            return;
        }
        while (currentCoach!= null){
            if (currentCoach.coachNumber.equalsIgnoreCase(coachNumber)){
                if (currentCoach.capacity >= currentCoach.seats + seats){
                    System.out.println("The number seats: "+seats+" you have requested for cancellation is successfully done against this coach number: "+ coachNumber);
                    currentCoach.seats = currentCoach.seats + seats;
                    break;
                }else {
                    System.out.println("Please enter a valid number of seats which will not exceeed our coach capacity");
                }
            }else {
                System.out.println("Please enter a valid coach number "+ coachNumber);
            }
            currentCoach = currentCoach.nextCoach;
        }
    }

    public void displayAllTrainCoaches(){
        TrainCoach currentCoach = firstCoach;
        if (currentCoach== null){
            System.out.println("Train coach is empty. Please try again later!");
            return;
        }
        System.out.println("Below are the list of train coaches present:");
        while (currentCoach!= null){
            System.out.println("Coach Number: "+ currentCoach.coachNumber + " available seats: "+currentCoach.seats+" coach capacity: "+ currentCoach.capacity);
            currentCoach = currentCoach.nextCoach;
        }
    }
    public void displayAllTrainCoachesInReverseOrder(){
        TrainCoach currentCoach = lastCoach;
        if (currentCoach== null){
            System.out.println("Train coach is empty. Please try again later!");
            return;
        }
        System.out.println("Below are the list of train coaches present:");
        while (currentCoach!= null){
            System.out.println("Coach Number: "+ currentCoach.coachNumber + " available seats: "+currentCoach.seats+" coach capacity: "+ currentCoach.capacity);
            currentCoach = currentCoach.prevCoach;
        }
    }

    public static void main(String[] args) {
        Scanner inputScanner = null;
        TrainReservationSystem trainReservationSystem = null;
        String coachNumber = "";
        int capacity = 0;
        int avaSeats = 0;
        try {
            trainReservationSystem = new TrainReservationSystem();
            trainReservationSystem.addCoach("abc123", 14, 6);
            trainReservationSystem.addCoach("abc987", 12, 10);
            inputScanner = new Scanner(System.in);
            boolean isRunning = true;
            boolean isApplicable = false;
            while (isRunning) {
                System.out.println("\nPlease choose the option below:");
                System.out.println("Press 1 to add a new coach");
                System.out.println("Press 2 to remove a new coach");
                System.out.println("Press 3 to display all coaches (forward and reverse)");
                System.out.println("Press 4 to reserve a seats in a specific coach");
                System.out.println("Press 5 to cancel seat reservation in a specific coach");
                System.out.println("Press 0 to exit the program");
                int usrChoice = inputScanner.nextInt();
                switch (usrChoice) {
                    case 1:
                        System.out.println("Please enter a coach number");
                        coachNumber = inputScanner.next();
                        while (!isApplicable) {
                            System.out.println("Please enter capacity");
                            capacity = inputScanner.nextInt();
                            System.out.println("Please enter available seats");
                            avaSeats = inputScanner.nextInt();

                            isApplicable = validateUserRequest(capacity, avaSeats);
                        }
                        if (isApplicable) {
                            trainReservationSystem.addCoach(coachNumber, capacity, avaSeats);
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
                        int flag = trainReservationSystem.reserveSeats(coachNumber, avaSeats);
                        while (flag == 1) {
                            if (flag == 1) {
                                System.out.println("Please enter the number of seats you want to reserve");
                                avaSeats = inputScanner.nextInt();
                                flag = trainReservationSystem.reserveSeats(coachNumber, avaSeats);
                            }
                        }
                        break;
                    case 5:
                        System.out.println("For cancellation of seats: we need the following details, Please cooperate");
                        System.out.println("Please provide us the coach number ");
                        coachNumber = inputScanner.next();
                        System.out.println("Please tell us how many seats you want to cancelled");
                        avaSeats = inputScanner.nextInt();
                        trainReservationSystem.cancelReservation(coachNumber, avaSeats);
                        break;
                    case 0:
                        isRunning = false;
                        System.out.println("Thank you for using our system. BYE!!!");
                        break;
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            inputScanner.close();
        }
    }

    private static boolean validateUserRequest(int capacity, int avaSeats) {

        if (capacity < avaSeats) {
            System.out.println("Sorry !!! You cannot add more seats than the capacity in train coach.");
            return false;
        }
        return true;
    }
}
