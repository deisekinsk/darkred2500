import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //scanner = get user input
        Scanner scanMain = new Scanner(System.in);
        Menu menu = new Menu(scanMain);
        menu.showMenu();
        scanMain.close();

    }
}