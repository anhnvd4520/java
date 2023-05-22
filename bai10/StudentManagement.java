package bai10;

import java.util.*;

public class StudentManagement {
    public List<Student> studentList = new ArrayList<>();

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap id hs:");
        int id = scanner.nextInt();
        System.out.println("Hay nhap name hs:");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Hay nhap tuoi hs:");
        int age = scanner.nextInt();
        System.out.println("Hay nhap dia chi hs:");
        scanner.nextLine();
        String address = scanner.nextLine();
        System.out.println("Hay nhap gpa hs:");
        double gpa = scanner.nextDouble();

        studentList.add(new Student(id, name, age, address, gpa));
    }

    public void showStudent() {
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }

    public Student findStudentById(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null; // Trả về null nếu không tìm thấy sinh viên với id tương ứng
    }

    public void editStudent(int id) {
        Student student = findStudentById(id);
        if (student != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter new name: ");
            String name = scanner.nextLine();
            System.out.print("Enter new age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("Enter new address: ");
            String address = scanner.nextLine();
            System.out.print("Enter new GPA: ");
            double gpa = scanner.nextDouble();

            student.setName(name);
            student.setAge(age);
            student.setAddress(address);
            student.setGpa(gpa);

            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(int id) {
        Student student = findStudentById(id);
        if (student != null) {
            studentList.remove(student);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void sortStudentsByGpa() {
        Collections.sort(studentList, Comparator.comparingDouble(Student::getGpa));
        System.out.println("Students sorted by GPA.");
    }

    public void sortStudentsByName() {
        Collections.sort(studentList, Comparator.comparing(Student::getName));
        System.out.println("Students sorted by name.");
    }

}
