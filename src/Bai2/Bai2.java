package JavaK86.core.Bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập số nguyên bất kì :");
        int a = scanner.nextInt();
        int sum = a * (1+11+111);
        System.out.printf("%d + %d%d + %d%d%d = %d ",a,a,a,a,a,a,sum);
    }
}
