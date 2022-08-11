package JavaK86.core.Bai5.DoWhile;

import java.util.Scanner;

public class DoWhileTinhTongTrungBinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tong = 0;
        float trungBinhCong =0;
        int i =0;
        do {
            tong+=i;
            i++;
        }while (i<=100);
        System.out.println("Tổng các số từ 1 đến 100 là :"+tong);
      //  System.out.println(new StringBuilder().append("Tong tu 1 den 100 la ").append(tong).toString());
        trungBinhCong=(float) tong/100;
        System.out.println("Trung bình cộng các số từ 1 đến 100 là :"+trungBinhCong);
      //  System.out.println(new StringBuilder().append("Trung binh cong cac so tu 1 den 100 la :").append(trungBinhCong).toString());
    }
}
