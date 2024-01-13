import java.util.Scanner;

class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();

        if(input > 0){
            System.out.println("Positive number");
        }
        if(input < 0){
            System.out.println("Negative number");
        }
    }
}