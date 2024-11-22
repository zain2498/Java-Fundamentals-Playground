package serialization;

import java.io.Serializable;

public class Student implements Serializable {

    /*
        Serializable is a marked interface which marked the object whether it is
        serializable or not.
     */

    private String name;
    private  int age;

    //Transient keyword is used to exclude any variable from serialization
    private String email; // transient private String email
    private String address;

    public Student(String name, int age, String email, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public  void displayName(){
        System.out.println("Hi my name is "+ this.name);
    }



}
