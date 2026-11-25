import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String[] phoneNumber = sc.next().split("-");
        
        System.out.println(phoneNumber[0] + "-" + phoneNumber[2] + "-" + phoneNumber[1]);
    }
}