package Collections;

import java.util.HashMap;
import java.util.Objects;

public class HashCodeAndEqualsMethod {


    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person(1,"Zain");
        Person p2 = new Person(2,"Shabbir");
        Person p3 = new Person(1,"Zain");

        map.put(p1, "Developer");
        map.put(p2, "QA");
        map.put(p3, "Senior Developer");

        System.out.println("size of hashmap "+ map.size());
        System.out.println("value of p1 "+ map.get(p1));
        System.out.println("value of p3 "+ map.get(p3));
    }
}


 class Person{
    private int id;
    private String name;

     public Person(int id, String name) {
         this.id = id;
         this.name = name;
     }

     public int getId() {
         return id;
     }

     public String getName() {
         return name;
     }

     @Override
     public int hashCode() {
         return Objects.hash(id,name);
     }

     @Override
     public boolean equals(Object obj) {
         if (this == obj){
             return  true;
         }else if (obj == null){
             return false;
         }else if (getClass() != obj.getClass()){
             return false;
         }
         Person other = (Person) obj;
         return id == other.getId() && Objects.equals(name, other.getName());
     }

     @Override
     public String toString() {
         return "Person{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 '}';
     }
 }
