package JavaK86.core.Bai3.VongLap;
public class Continue {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 5; i++) {
            System.out.println("lần lặp " + i);
            if (i <=4 ) {
                continue;
            }
            System.out.println("Chào bạn");
        }
    }
}
