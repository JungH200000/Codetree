import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String time = sc.next();
        String[] strArr = time.split(":");

        int hour = Integer.parseInt(strArr[0]);
        int minute = Integer.parseInt(strArr[1]);
        
        System.out.println((hour + 1) + ":" + minute);
    }
}