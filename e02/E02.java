import java.util.Scanner;

class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int input1 = scanner.nextInt();
        System.out.println("Give a number: ");
        int input2 = scanner.nextInt();
        System.out.println(input1+" + "+input2+" = "+(input1+input2));
        System.out.println(input1+" - "+input2+" = "+(input1-input2));
        System.out.println(input1+" x "+input2+" = "+(input1*input2));
        System.out.println(input1+" / "+input2+" = "+(input1/input2));
    }
}