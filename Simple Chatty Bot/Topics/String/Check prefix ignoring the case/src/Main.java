import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean checkPrefix = str.toUpperCase().startsWith("J");
        System.out.println(checkPrefix);

    }
}