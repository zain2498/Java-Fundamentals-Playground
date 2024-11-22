package OptionalClass;

import java.util.Optional;

//optional class is not serializable

public class OptionalExample {


    public static Optional<String> getName(){
        String name = "Zain Badar";
     return Optional.ofNullable(null);
    }


    public static void main(String[] args) {
        String str = null;
        Optional<String> optional = Optional.ofNullable(str);

        System.out.println(optional.isPresent());
       // System.out.println(optional.orElse("there is no such element present"));

           Optional<String> nameOptional =getName();
           System.out.println(nameOptional.orElse("This function return null"));
    }


}
