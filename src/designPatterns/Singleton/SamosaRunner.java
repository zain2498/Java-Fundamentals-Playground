package designPatterns.Singleton;

public class SamosaRunner {


    public static void main(String[] args) {

        /*  Both objects have the same hashcode it means we have restrict the object invocation to one time
            and hence we have achieved the singleton design pattern.
         */

        //obj 1
        Samosa samosa = Samosa.getSamosa();
        System.out.println(samosa.hashCode());

        //obj 2
        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
    }

}
