import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        int sec = scanner.nextInt();

        int start = hour * 3600 + min * 60 + sec;

        hour = scanner.nextInt();
        min = scanner.nextInt();
        sec = scanner.nextInt();

        int end = hour * 3600 + min * 60 + sec;

        System.out.println(end - start);
    }
}