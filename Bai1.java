public class Bai1 {
    public static void timSoChiaHetBay() {
        for (int i = 10; i <= 200; i++) {
            if (i % 7 == 0 && i % 5 != 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
