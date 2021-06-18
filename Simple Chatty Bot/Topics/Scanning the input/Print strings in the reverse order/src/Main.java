//put imports you need here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String java = scanner.nextLine();
        String prog = scanner.nextLine();
        String lang = scanner.nextLine();

        System.out.printf("%s\n%s\n%s%n", lang, prog, java);
    }
}