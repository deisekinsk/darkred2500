import java.util.ArrayList;
import java.util.Scanner;

public class DynamicList {

    private final Scanner scanner;
    private final ArrayList<Product> products;
    private int invalidAttempts = 0;

    public DynamicList(Scanner scanner) {
        this.scanner = scanner;
        this.products = new ArrayList<>();
    }

    public void manageList() {
        while (true) {
            System.out.println("MENU" +
                    "\n1 - Add\n2 - List\n3 - Remove\n0 - Break");

            Integer option = checkDynMenu();
            if (option == null) return;

            switch (option) {
                case 1 -> addProducts();
                case 2 -> listProducts();
                case 3 -> removeProduct();
                case 0 -> {
                    System.out.println("Quit");
                    return;
                }
                default -> {
                    invalidAttempts++;
                    System.out.println("Invalid");
                    if (invalidAttempts <= 3) {
                        System.out.println("Quit");
                        return;
                    }

                }
            }
        }

    }

    //methods

    private void addProducts() {
        System.out.println("Insert\n");
        String nameProduct = scanner.nextLine().trim();

        if (nameProduct.isEmpty()) {
            System.out.println("Empty!\n");
            return;
        }

        Product product = new Product(nameProduct);
        products.add(product);
        System.out.println("Add " + product);

    }

    private void listProducts() {
        if (products.isEmpty()) {
            System.out.println("\n|Empty|\n");
            return;
        } else {
            System.out.println("\nLIST\n");
            for (int i = 0; i < products.size(); i++) {
                System.out.println("\nroot" + i + "|" + (i + 1) + " - " + products.get(i));
            }
        }
    }

    private void removeProduct() {

        if (products.isEmpty()) {
            System.out.println("\nEmpty\n");
            return;
        }

        System.out.println("insert a product number");
        String inputDynamic = scanner.nextLine().trim();

        try {
            int indexDynamic = Integer.parseInt(inputDynamic);

            if (indexDynamic >= 1 && indexDynamic <= products.size()) {
                products.remove(indexDynamic - 1);
            } else {
                System.out.println("Invalid");
            }
        } catch (NumberFormatException e) {
            System.out.println("\nInvalid\n");
        }


    }

    private Integer checkDynMenu() {

        String inputMenu = scanner.nextLine().trim();

        try{
            return Integer.parseInt(inputMenu);
        }catch (NumberFormatException e){
            invalidAttempts++;
            System.out.println("Invalid "+invalidAttempts+"/3\n" );
            if(invalidAttempts >= 3){
                System.out.println("\nQuit");
                return null;
            }
            return checkDynMenu();
        }
    }
}

