import java.util.Scanner;

class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean valid = true;
        while (valid) {
            System.out.println("Give a number (0 to quit):");
            int input = scanner.nextInt();

            if (input == 0) {
                valid = false;
            } else {
                if (input % 2 == 0) {
                    System.out.println("Number is even");
                } else {
                    System.out.println("Number is odd");
                }
            }
        }

    }
}