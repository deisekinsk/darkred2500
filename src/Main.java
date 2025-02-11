import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Dynamic list | add(); get(i); set(i,"str"); remove(i or str)
        ArrayList<Product> products = new ArrayList<>();

        ArrayList<Product2> product2s = new ArrayList<>();


        boolean isPalin = Product2.isPalindrome("madam");
        System.out.println( isPalin ? "Is palindrome\n" : "False palindrome\n" );

        Product p1 = new Product();
        p1.setName("Laptop ZION0235");
        products.add(p1);

        Product p2 = new Product();
        p2.setName("Laptop XENA885");
        products.add(p2);

        Product p3 = new Product();
        p3.setName("Laptop HERCULES588");
        products.add(p3);

        Product p4 = new Product();
        p4.setName("Laptop ZION0235");
        products.add(p4);

        // List iteration
        /*for (int i =0; i < products.size(); i++) {
            System.out.println("product " + (i + 1) + ": " +
                    products.get(i));

        }*/
        ///for each
        int index = 1;
        for (Product product : products) {
            System.out.println("product " + index++ + ": " + product);
        }

        //Ternary Operator and equals()
        System.out.println("\nComparison: "+ (p1.equals(p2) ? p1 +
                " is equal to " + p2 : p1 +" is different " + p2));


        //Iteration
        for(int i = 0; i < products.size(); i++ ){
            System.out.println("\nComparison " + (i + 1) + ": " + (p1.equals(products.get(i))
                    ? p1 +" is equal to " + products.get(i) :
                    p1 +" is different " + products.get(i)));
        }




    }
}