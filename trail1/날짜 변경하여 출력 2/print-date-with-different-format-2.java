import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] date = sc.next().split("-");
        
        int year = Integer.parseInt(date[2]);
        int month = Integer.parseInt(date[0]);
        int day = Integer.parseInt(date[1]);

        System.out.println(year + "." + month + "." + day);
    }
}