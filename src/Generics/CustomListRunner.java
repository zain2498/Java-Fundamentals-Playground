package Generics;

public class CustomListRunner {

    public static void main(String[] args) {
        MyCustomList<String> list1 = new MyCustomList<>();
        list1.addElement("Element1");
        list1.addElement("Element2");
        list1.addElement("Element3");
        String value = list1.get(0);

        System.out.println(value);
        System.out.println(list1);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(Integer.valueOf(1));
        list2.addElement(Integer.valueOf(2));
        list2.addElement(Integer.valueOf(3));
        Integer number = list2.get(0);

        System.out.println(number);
        System.out.println(list2);
    }

}
