import bai10.Student;
import bai10.StudentManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Bai1.timSoChiaHetBay();
//        Bai2.timgiaithua();
//        Bai3.taoramap();
//        Bai4.giaibachai();
//        Bai5.tongcacchuso();
//        Bai6.sothuannghich();
//        Bai9.mangsonguyen();
//        Bai7.xaukitu();
        StudentManagement studentManagement = new StudentManagement();
        while (true) {
            System.out.println("Hay chon chuc nang:");
            System.out.println("" +
                    "1. Add student.\n" +
                    "2. Edit student by id.\n" +
                    "3. Delete student by id.\n" +
                    "4. Sort student by gpa.\n" +
                    "5. Sort student by name.\n" +
                    "6. Show student.\n" +
                    "0. Exit.\n");
            Scanner scanner = new Scanner(System.in);
            int numberFunc = scanner.nextInt();

            int id;
            switch (numberFunc) {
                case 1:
                    studentManagement.addStudent();
                    break;
                case 2:
                    System.out.println("Nhap id");
                    id = scanner.nextInt();
                    studentManagement.editStudent(id);
                    break;
                case 3:
                    System.out.println("Nhap id");
                    id = scanner.nextInt();
                    studentManagement.deleteStudent(id);

                    break;
                case 4:
                    studentManagement.sortStudentsByGpa();
                    break;
                case 5:
                    studentManagement.sortStudentsByName();
                    break;
                case 6:
                    studentManagement.showStudent();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("So ban nhap khong co chuc nang. Hay chon lai so khac.");
            }
        }
    }
}