import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean pos1 = num1 > 0;
        boolean pos2 = num2 > 0;
        boolean pos3 = num3 > 0;
        boolean first = pos1 && !pos2 && !pos3;
        boolean second = pos2 && !pos1 && !pos3;
        boolean third = pos3 && !pos1 && !pos2;
        boolean result = first || second || third;

        System.out.println(result);
    }
}