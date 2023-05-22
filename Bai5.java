import java.util.Scanner;

public class Bai5 {
    public static void tongcacchuso() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen n");
        int n = scanner.nextInt();

        int sum = 0;
        while (n != 0) {
            int du = n % 10;
            sum += du;
            n = n / 10;
        }
        System.out.println(n + sum);
    }
}