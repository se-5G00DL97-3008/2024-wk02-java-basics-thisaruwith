import java.util.Scanner;

class E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean valid = true;
        double total = 0;
        double avg = 0.0;
        int x = 1;
        while (valid) {
            System.out.println("Give a test score (-1 to quit):");
            double score = scanner.nextDouble();
            
            if (score == -1) {
                System.exit(0);
            }else{
                total += score;
                avg = total/x;
            } 
            System.out.println("Average: "+avg);
            x++;           
        }
    }
}