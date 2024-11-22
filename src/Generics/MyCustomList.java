package Generics;

import java.util.ArrayList;



//T --> stands for ---> TYPE we can use any letter but to keep in mind that letter should be in uppercase
public class MyCustomList <T>{

    ArrayList<T> arrayList = new ArrayList<>();

    public void addElement(T element){
        arrayList.add(element);
    }

    public void removeElement(T element){
        arrayList.remove(element);
    }

    public T get(Integer index){
       return arrayList.get(index);
    }

    public String toString(){
        return arrayList.toString();
    }

}
