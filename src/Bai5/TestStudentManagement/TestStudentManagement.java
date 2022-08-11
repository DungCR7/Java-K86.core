package JavaK86.core.Bai5.TestStudentManagement;

public class TestStudentManagement {
    public static void main(String[] args) {
        TestStudent cuong = new TestStudent();
        cuong.setDiemToan(9.0f);
        cuong.setDiemLy(8.0f);
        cuong.setDiemHoa(8);

        cuong.tinhGPA();

        System.out.println("GPA cuong: "+cuong.getDiemGPA());
        System.out.println("Xep loai: "+cuong.getXepLoai());
    }
}
