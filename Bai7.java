import java.util.Scanner;

public class Bai7 {
    public static void xaukitu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao xau");
        String chuoi = scanner.nextLine();
//        xóa khoảng trắng
        String[] mang = chuoi.split(" ");
        // Mảng lưu trữ số lần xuất hiện của từng từ
        int[] counts = new int[mang.length];

// Đếm số lần xuất hiện của từng từ
        for (int i = 0; i < mang.length; i++) {
            // Nếu từ hiện tại đã được đếm trước đó, tăng giá trị đếm lên 1
            if (counts[i] != -1) {
                int count = 1;
                for (int j = i + 1; j < mang.length; j++) {
                    if (mang[i].equals(mang[j])) {
                        count++;
                        // Đánh dấu từ đã được đếm bằng cách đặt giá trị -1
                        counts[j] = -1;
                    }
                }
                // Lưu số lần xuất hiện của từ
                counts[i] = count;
            }
        }


        // In ra kết quả
        for (int i = 0; i < mang.length; i++) {
            if (counts[i] != -1) {
                System.out.println(mang[i] + ": " + counts[i]);
            }

        }


    }
}

