//put imports you need here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String cuisine = scanner.nextLine();
        cuisine = scanner.nextLine();
        cuisine = scanner.nextLine();
        cuisine = scanner.nextLine();

        System.out.printf("The form for %s is completed. We will " +
                        "contact you if we need a chef that cooks %s " +
                        "dishes.\n", name, cuisine);
    }
}