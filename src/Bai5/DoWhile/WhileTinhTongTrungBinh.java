package JavaK86.core.Bai5.DoWhile;

//import java.sql.SQLOutput;
//import java.util.Scanner;

public class WhileTinhTongTrungBinh {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int tong = 0;
        float trungBinhCong ; // k nhất thiết cần khai báo biến trungBinhCong = 0;
        int i = 1;
        while (i<=100){
            System.out.println(i);
            tong+=i;
            i++;
        }
        trungBinhCong= (float) tong/100;
        System.out.println("Tổng các số vừa nhập là:"+tong);
     //   System.out.println(new StringBuilder().append("Tong tu 1 den 100 la ").append(tong).toString());
        System.out.println("Trung bình cộng các số vừa nhập là:"+trungBinhCong);
      //  System.out.println(new StringBuilder().append("Trung binh cong cac so vua nhap la :").append(trungBinhCong).toString());
    }
}
