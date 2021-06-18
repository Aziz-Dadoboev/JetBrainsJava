import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        first = first / 2 + first % 2;
        second = second / 2 + second % 2;
        third = third / 2 + third % 2;

        System.out.println(first + second + third);
    }
}