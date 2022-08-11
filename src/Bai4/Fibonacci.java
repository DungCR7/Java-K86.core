package JavaK86.core.Bai4;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
     /*   int n = 0;
        int a=0,b=1;
        int c;
        do {
            System.out.printf("Nhập n:  ");
            j = scanner.nextInt();
        }while (n<0);
        for (int i=0;i<n;i++){
            c = a+b;
            a = b;
            b = c;
            System.out.printf("\t"+c);
        }

     */
        System.out.print("Chiều dài fibonacci:");
        int n = scanner.nextInt();
        int a = 1;
        int b = 0;
        for (int i=1; i <=n; i++ ) {
            int c = b;
            b = b + a;
            a = c;
            System.out.print(b + ", ");
        }
    }
}
