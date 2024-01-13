import java.util.Scanner;

class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (0 to quit):");
        int input = scanner.nextInt();

        if(input == 0){
            System.exit(0);
        }else{
            if(input % 2 == 0){
                System.out.println( "Even number");
            }else{
                System.out.println("Odd number");
            }
        }
    }
}