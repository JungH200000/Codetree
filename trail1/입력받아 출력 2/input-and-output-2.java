import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] rrnArr = sc.next().split("-");
        String rrn = rrnArr[0] + rrnArr[1];

        System.out.println(rrn);
    }
}