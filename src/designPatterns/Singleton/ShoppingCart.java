package designPatterns.Singleton;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private static ShoppingCart sc;
    private int quantity;
    private List<String> listOfitems;

    private ShoppingCart() {
        this.quantity = 0;
        listOfitems = new ArrayList<>();
    }

    /*
    * The below method is thread safe
    * if two process A and B check the instance they get the null value
    * both try to create the instance simultaneously which will violates the singleton
    * hence to handle this case we used synchronized keyword why not with the method body and why inside the method
    * because if we use on method header after static keywords it hits the performance and slow it down
    * which is why we used it in the method body to only applicable when the instance initiation
    * The below method is now thread safe
    * */
    public static ShoppingCart getInstance() {
        if (sc == null) {
            synchronized (ShoppingCart.class) {
                if (sc == null) {
                    sc = new ShoppingCart();
                }
            }
        } else {
            System.out.println("You are not allowed to create another instance of singleton object.");
        }
        return sc;
    }

    public int getQuantity() {
        return quantity;
    }

    public List<String> getListOfItems() {
        return listOfitems;
    }

    public void addItemsToCart(String items) {

        if (items.trim().isEmpty()) {
            System.out.println("Please enter the valid item name");
            return;
        }

        listOfitems.add(items);
        quantity += 1;
        System.out.println("Items available in our inventory are: ");
        for (String ite : listOfitems) {
            System.out.print(ite + " ");
        }
        System.out.println();
        System.out.println("Total number of items are : " + quantity);
    }

    public static void main(String[] args) {
        ShoppingCart sc = getInstance();
        sc.addItemsToCart("trouser");
        sc.addItemsToCart("tshirt");
        sc.addItemsToCart("pant");
    }
}
