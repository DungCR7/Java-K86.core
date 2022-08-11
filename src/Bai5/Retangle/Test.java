package JavaK86.core.Bai5.Retangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập width:");
        float width = scanner.nextFloat();
        System.out.println("Nhập height:");
        float height = scanner.nextFloat();

        Retangle retangle = new Retangle(width,height);
        System.out.println("Chu vi là:"+retangle.tinhChuVi());

        System.out.println("Diện tích là:"+retangle.tinhDienTich());
        boolean checkSquare = retangle.checkSquare();
        if (width == height){
            System.out.println("Đây là hình vuông");
        }else {
            System.out.println("Đây không phải hình vuông");
        }
    }
}
