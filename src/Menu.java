import java.util.Scanner;

public class Menu {

    private Scanner scanner;
    private DynamicList dynamicList;

    public Menu (Scanner scanner){
        this.scanner = scanner;
        this.dynamicList = new DynamicList(scanner);
    }

    public void showMenu(){
        int choice;

        do{
            System.out.println("\nMENU" +
                    "\n1 - FizzBuzz\n2 - Palindrome\n3 - Dynamic List\n0 - Break");
            choice = scanner.nextInt();
            scanner.nextLine();//clean buffer

            switch (choice){
                case 1:
                    System.out.println("Insert a integer number\n");
                    int num = scanner.nextInt();
                    System.out.println(Product3.isFizzBuzz(num));
                    break;
                case 2:
                    System.out.println("Insert a word");
                    String word = scanner.next();
                    boolean isPalindrome = Product2.isPalindrome(word);
                    System.out.println(isPalindrome ? "\nTrue palindrome\n" : "False palindrome");
                    break;
                case 3:
                    dynamicList.manageList();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("System off");
                    break;
            }

        } while (choice != 0);
    }


}
