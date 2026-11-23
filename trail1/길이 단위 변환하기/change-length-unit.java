public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        double ft = 30.48;
        double mi = 160934;

        double a = 9.2;
        double b = 1.3;
        double ftToCm = ft * a;
        double miToCm = mi * b;

        System.out.printf("%.1fft = %.1fcm\n", a, ftToCm);
        System.out.printf("%.1fmi = %.1fcm\n", b, miToCm);
    }
}