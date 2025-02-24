import java.util.ArrayList;
import java.util.Scanner;

public class DynamicList {

    private final Scanner scanner;
    private final ArrayList<Product> products;

    public DynamicList(Scanner scanner){
        this.scanner = scanner;
        this.products = new ArrayList<>();
    }

    public void manageList(){
        while (true){
            System.out.println("MENU" +
                    "\n1 - Add\n2 - List\n3 - Remove\n0 - Break");

            int option = scanner.nextInt();
            scanner.nextLine();//Clean buffer

            switch (option){
                case 1://add
                    System.out.println("Insert product");
                    String name = scanner.nextLine();
                    Product product = new Product();
                    product.setName(name);
                    products.add(product);
                    break;
                case 2://list
                    if(products.isEmpty()){
                        System.out.println("Empty");
                    } else {
                        System.out.println("\nLIST\n");
                        for(int i = 0; i < products.size(); i++){
                            System.out.println(("root" + i + "| ")+(i + 1) + " - " + products.get(i));
                        }
                    }
                    break;
                case 3://remove
                    int index = scanner.nextInt();
                    if(index > 0 && index <= products.size()){
                        products.remove(index - 1);
                        } else {
                        System.out.println("Invalid");
                    }

                default:
                    System.out.println("Invalid");
            }
        }

    }

}
