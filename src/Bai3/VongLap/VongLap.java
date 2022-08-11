package JavaK86.core.Bai3.VongLap;

import java.util.Scanner;
public class VongLap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* int sum = 0;
        for (int i = 0;i<7;i++){
            if (i ==4)
                // tổng = 1 + 2 +3
                break; // đến dòng 4 thì ngắt không chạy nữa chỉ lấy số 4 đổ về,break = ngắt dòng
            sum += i;
        }
        System.out.println(sum);
*/
      /* int a = 0;
        do {
            System.out.println("b"); // a chỉ chạy đến số 2 vì while (a<3)
            a++;
        }while (a<3); */
     /*   int a = 10;
        int b = 5;
        if (a==10 || b ==10){ // dấu hoặc (có hay không cũng được miễn là đúng thì chạy 1 trong 2)
            System.out.println("1");
        }else if (a == 10 && b ==5){
            System.out.println("2");
        }else if (a > 0 || b >5){
            System.out.println("3");
        }else {
            System.out.println("4");
        }
*/
      /* int option = 2;
        switch (option){
            case 1:
                System.out.println("summer");
                break;
              // có break thì ngắt k có thì chạy hết
            case 2:
                System.out.println("winter");
                break;
            case 3:
                System.out.println("spring");
                break;
            case 4:
                System.out.println("autumn");
                break;
        }
*/
        int sum = 0;
        for (int i =0;i<5;i++){
            if (i ==3 ) // i chạy từ 0 đến 4 (i<5) chạy đến 3 thì bỏ qua 3 rồi chạy tổng
                // tổng = 0+1+2+4=7
                continue;
            sum+=i;
        }
        System.out.println(sum);

    }
}
