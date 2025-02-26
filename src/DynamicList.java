import java.util.ArrayList;
import java.util.Scanner;

public class DynamicList {

    private final Scanner scanner;
    private final ArrayList<Product> products;
    private int invalidAttempts = 0;

    public DynamicList(Scanner scanner){
        this.scanner = scanner;
        this.products = new ArrayList<>();
    }

    public void manageList(){
        while (true){
            System.out.println("MENU" +
                    "\n1 - Add\n2 - List\n3 - Remove\n0 - Break");

            Integer option = checkDynMenu();
            if(option == null) return;

            switch (option){
                case 1://add
                    addProducts();
                    invalidAttempts = 0;
                    break;
                case 2://list
                    listProducts();
                    invalidAttempts = 0;
                    break;
                case 3://remove
                    removeProduct();
                    invalidAttempts = 0;
                    break;
                case 0:
                    System.out.println("Quit");
                    break;
                default:
                    invalidAttempts++;
                    System.out.println("Invalid");
                    if(invalidAttempts <= 3){
                        System.out.println("Quit");
                        break;
                    }
            }
        }

    }

    //methods

    private void addProducts(){
        System.out.println("Insert");
        String nameProduct = scanner.nextLine();
        Product product = new Product();

        product.setName(nameProduct);
        products.add(product);
    }

    private void listProducts(){
        if(products.isEmpty()){
            System.out.println("\n|Empty|\n");
        }else{
            System.out.println("\nLIST\n");
            for(int i = 0; i < products.size(); i++){
                System.out.println("\nroot" + i + "|" + (i+1) + " - " + products.get(i));
            }
        }
    }

    private void removeProduct(){
        int index = scanner.nextInt();

        if(index > -1 && index <= products.size()){
            products.remove(index -1);
        }else{
            System.out.println("Invalid");
        }


    }

    private Integer checkDynMenu(){
        if(!scanner.hasNextInt()){
            System.out.println("Invalid" + invalidAttempts);
            invalidAttempts++;
            if(invalidAttempts >= 3){
                System.out.println("\nQuit");
            }
            return checkDynMenu();
        }
        return scanner.nextInt();
    }
}
