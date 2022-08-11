package JavaK86.core.Bai4;

public class ArrayExample {
    public static void main(String[] args) {
        float[] num2;
        num2 = new float[5];
        num2[0]=1;
        num2[1]=5;
        num2[2]=30;
        num2[4]=6;
        num2[3]=7;
        for (float i: num2){
            System.out.println(i);
        } //in ra toan bo cac phan tu cua mang
//        num2 = new float[]{1, 5, 4, 9, 3, 7};
        System.out.println("ĐỘ DÀI CỦA MẢNG LÀ "+num2.length);
    }
}
