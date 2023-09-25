import java.util.ArrayList;
import java.util.Scanner;
public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    /**
     * Thêm học sinh mới
     */
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID học sinh: ");
        int id = scanner.nextInt();
        System.out.println("Nhập tên học sinh: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi học sinh: ");
        int age = scanner.nextInt();
        System.out.println("Nhập quê quán học sinh: ");
        String hometown = scanner.nextLine();
        System.out.println("Nhập lớp học sinh: ");
        String classNumber = scanner.nextLine();

        Student student = new Student(id, name, age, hometown, classNumber);
        students.add(student);
    }

    /**
     * Sửa thông tin học sinh theo ID
     */
    public void editStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID học sinh cần sửa: ");
        int id = scanner.nextInt();

        Student student = findStudentById(id);
        if (student == null) {
            System.out.println("Không tìm thấy học sinh có ID = " + id);
            return;
        }

        System.out.println("Nhập tên học sinh mới: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi học sinh mới: ");
        int age = scanner.nextInt();
        System.out.println("Nhập quê quán học sinh mới: ");
        String hometown = scanner.nextLine();
        System.out.println("Nhập lớp học sinh mới: ");
        String classNumber = scanner.nextLine();

        student.setName(name);
        student.setAge(age);
        student.setHometown(hometown);
        student.setClassNumber(classNumber);
    }

    /**
     * Xóa học sinh theo ID
     */
    public void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID học sinh cần xóa: ");
        int id = scanner.nextInt();

        Student student = findStudentById(id);
        if (student == null) {
            System.out.println("Không tìm thấy học sinh có ID = " + id);
            return;
        }

        students.remove(student);
    }

    /**
     * Hiển thị thông tin tất cả học sinh
     */
    public void showAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    /**
     * Tìm học sinh theo ID
     */
    private Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    /**
     * Hiển thị thông tin các học sinh 20 tuổi
     */
    public void showStudentsOfAge20() {
        for (Student student : students) {
            if (student.getAge() == 20) {
                System.out.println(student);
            }
        }
    }

    /**
     * Trả về số lượng học sinh có tuổi 23 và quê ở Đà Nẵng
     */
    public int getNumberOfStudentsOfAge23AndHometownDaNang() {
        int count = 0;
        for (Student student : students) {
            if (student.getAge() == 23 && student.getHometown().equals("Đà Nẵng")) {
                count++;
            }
        }
        return count;
    }

    // ...
}