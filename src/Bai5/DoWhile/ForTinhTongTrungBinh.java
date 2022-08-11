package JavaK86.core.Bai5.DoWhile;

import java.util.Scanner;

public class ForTinhTongTrungBinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tong = 0;
        float trungBinhCong = 0;
        for (int i = 1;i<=100;i++){
            System.out.println(i);
            tong+=i;
            trungBinhCong=(float) tong /100;
        }
        System.out.println("Tổng các số vừa nhập là:"+tong);
        System.out.println("Trung bình các số vừa nhập là :"+trungBinhCong);
       // System.out.println(new StringBuilder().append("Trung binh cong cac so vua nhap la :").append(trungBinhCong).toString());

    }
}
