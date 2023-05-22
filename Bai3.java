import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai3 {
    public static void taoramap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen");
        int number = scanner.nextInt();
        Map map = new HashMap();
        for (int i = 1; i <= number; i++) {
            map.put(i, i * i);
        }
        System.out.println(map.toString().replaceAll("=", ":"));
    }
}
