import java.util.Scanner;

public class Bai6 {
    public static void sothuannghich() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen n");
        int n = scanner.nextInt();
        int number = n;
        int newnum = 0;
        int sum = 0;
        while (n != 0) {
            int du = n % 10;
            newnum = newnum * 10 + du;
            n = n / 10;
        }
        System.out.println(newnum);
        if (newnum == number) {
            System.out.println("so thuan nghich");
        } else {
            System.out.println("khong phai so thuan nghich");
        }
    }
}
