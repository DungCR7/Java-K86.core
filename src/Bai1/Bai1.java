package JavaK86.core.Bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Nhập a:");
        a = scanner.nextInt();
        System.out.println("Nhập b:");
        b = scanner.nextInt();
        int tong = a + b;
        System.out.println("Tổng là :"+tong);
        int hieu = a-b;
        System.out.println("Hiệu là :"+hieu);
        int tich = a*b;
        System.out.println("Tích là :"+tich);
        int thuong = a/b;
        System.out.println("Thương là :"+thuong);
        int mod = a%b;
        System.out.println("Mod là :"+mod);
    }
}
