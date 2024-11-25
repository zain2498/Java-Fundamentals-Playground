package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
*  Java throw keyword is used to throw an exception explicitly in the code, inside the function or the block of code.
*  Java throws keyword is used in the method signature to declare an exception which might be thrown by the function while the execution of the code.
*
*
*
*
*
*
*
*
*/


public class ThrowExample {

    /*unchecked exception
    * Every subclass of Error and RuntimeException is an unchecked exception in Java.
    *  A checked exception is everything else under the Throwable class.
    * */
    public static void validate(int age){
        if(age < 18){
            throw new ArithmeticException("you are not eligible to get an ID card");
        }

        System.out.println("congratulations you ready for ID card ");
    }

    /* Unchecked exception Example
    *  unchecked exception me throws karana ya try/catch block me exception ko handle karana zaroori ha
    *
    * */

    public static void openFile() throws FileNotFoundException {
        FileReader file = new FileReader("C:\\user\\desktop\\abc.txt");
        BufferedReader bufferedReader = new BufferedReader(file);

        throw new FileNotFoundException("File is not present on the given path");
    }

    public static void main(String[] args) {
        validate(11);

        try {
            openFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
