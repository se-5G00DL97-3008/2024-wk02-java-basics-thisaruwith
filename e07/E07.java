import java.util.Scanner;

class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which multiplication table to show?");
        int multiplicand = scanner.nextInt();
        System.out.println("Until which multiplier should the table show?");
        int multiplyer = scanner.nextInt();

        for (int i = 0; i <= multiplyer; i++) {
            System.out.println(i + " x " + multiplicand + " = " + (i * multiplicand));
        }
    }
}