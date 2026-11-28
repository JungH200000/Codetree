import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int weight = sc.nextInt();

        double b = (double) (weight * 10_000) / (height * height);
        System.out.println((int) b);

        if (b >= 25) {
            System.out.println("Obesity");
        }
    }
}