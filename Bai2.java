import java.util.Scanner;

public class Bai2 {
    public static void timgiaithua() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen");
        int number = scanner.nextInt();
        int n = 1;
        for (int i = 1; i <= number; i++) {
            n = n * i;
            if (i == number) {
                System.out.print(i + "=");
            } else {
                System.out.print(i + "*");
            }
        }
        System.out.println(n);

    }
}
