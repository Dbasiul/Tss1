package lt.vcd;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter laptop price (p): ");
        int p = scanner.nextInt();

        System.out.print("Enter saved amount (s): ");
        int s = scanner.nextInt();

        System.out.print("Enter weekly savings (m): ");
        int m = scanner.nextInt();

        int weeks = 0;
        int total = s;

        while (total < p) {
            total += m;
            weeks++;
        }

        System.out.println("k = " + weeks);
        scanner.close();
    }
}
