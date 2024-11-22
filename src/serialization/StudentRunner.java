package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentRunner {

    public static void main(String[] args) {
        try{
            Student student  = new Student("Zain Badar", 25, "zain@gmail.com", "Abc Road Karachi");

            FileOutputStream fos = new FileOutputStream("ob.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(student);

            fos.close();
            oos.close();

            System.out.println("Object stream is successfuly transferred.");
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }



}
