import java.util.Scanner;

public class Bai4 {
    public static void giaibachai(){
        System.out.println("nhap he so a,b,c:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int delta= (int) (Math.pow(b,2)-4*a*c);
        if (delta>0){
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else if (delta ==0){
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép:");
            System.out.println("x = " + x);
        }
        else {
            System.out.println("vo nghiem");
        }
    }
}
