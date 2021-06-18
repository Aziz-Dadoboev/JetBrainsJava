import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean first = a + b > c;
        boolean second = a + c > b;
        boolean third = b + c > a;

        if (first && second && third) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}