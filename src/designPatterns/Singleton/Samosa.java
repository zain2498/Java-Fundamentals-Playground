package designPatterns.Singleton;

public class Samosa {

    //Static variable has by default null value initialize
    private static Samosa samosa;

    private Samosa(){

    }

    public static Samosa getSamosa(){

        /* In static methods only static variables can be used if we have to use other than static variables we could use it with
            the help of object instance.
         */

        if(samosa == null){

            samosa = new Samosa();
        }

        return samosa;

    }

}
