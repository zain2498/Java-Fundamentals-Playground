package EnumRepo;
    /*
            Why enums ?
            Ans : In Java, enum was introduced to replace the use of int constants.

            class Size {
               public final static int SMALL = 1;
               public final static int MEDIUM = 2;
               public final static int LARGE = 3;
               public final static int EXTRALARGE = 4;
            }

            Here, the problem arises if we print the constants. It is because only the number is printed which might not be helpful.

            So, instead of using int constants, we can simply use enums.
            This makes our code more intuitive.

            Also, enum provides compile-time type safety.

            If we declare a variable of the Size type. For example,

            Size size;
            Here, it is guaranteed that the variable will hold one of the four values. Now, If we try to pass values other than those four values, the compiler will generate an error
     */


enum Size{


    //when we have to restrict the values there this enum class comes in.


    /*
        When we create an enum class, the compiler will create instances (objects) of each enum constants.
        Also, all enum constant is always public static final by default.
     */

    SMALL,MEDIUM,LARGE,EXTRALARGE;

    public String getSize(){

        switch (this){
            case SMALL :
                return "SMALL";
            case LARGE:
                return "LARGE";
            case MEDIUM:
                return "MEDIUM";
            case EXTRALARGE:
                return "EXTRALARGE";
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("The size of the t-shirt is "+Size.LARGE.getSize());
    }

    /*
        In the above example, we have created an enum class Size. It has four constants SMALL, MEDIUM, LARGE and EXTRALARGE.
        Since Size is an enum class, the compiler automatically creates instances for each enum constants.
        Here inside the main() method, we have used the instance SMALL to call the getSize() method.
     */

}