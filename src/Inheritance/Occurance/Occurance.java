package Inheritance.Occurance;

import java.util.Map;

abstract class Occurance<T> {

    String typeOfOcc;

    public  Occurance(String typeOfOccurance){
        this.typeOfOcc = typeOfOccurance;
    }

    public abstract Map<T,T> countOccurance();

    public void displayTypeOfOccurance(){
        System.out.println("\nType of occurance is "+typeOfOcc);
        System.out.println("Occurances are "+countOccurance());
    }
}
