package JavaK86.core.Bai5.TestStudentManagement;

public class TestStudent {
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    private float diemGPA;
    private String xepLoai;

    public float getDiemToan() {

        return diemToan;
    }

    public void setDiemToan(float diemToan) {

        this.diemToan = diemToan;
    }

    public float getDiemLy() {

        return diemLy;
    }

    public void setDiemLy(float diemLy) {

        this.diemLy = diemLy;
    }

    public float getDiemHoa() {

        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {

        this.diemHoa = diemHoa;
    }

    public float getDiemGPA() {

        return diemGPA;
    }

    public void setDiemGPA(float diemGPA) {

        this.diemGPA = diemGPA;
    }

    public String getXepLoai() {

        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {

        this.xepLoai = xepLoai;
    }

    public void tinhGPA() {
        this.diemGPA = (this.diemHoa + this.diemToan + this.diemLy) / 3;
        if (this.diemGPA > 8) {
            this.xepLoai = "Gioi";
        } else if (this.diemGPA > 6 && this.diemGPA < 8) {
            this.xepLoai = "Kha";
        } else {
            this.xepLoai = "Trung binh";

        }
    }
}
