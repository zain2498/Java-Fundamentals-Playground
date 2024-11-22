package serialization.Deserialization;

import serialization.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("ob.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student student = (Student) ois.readObject();
            student.displayName();


        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
