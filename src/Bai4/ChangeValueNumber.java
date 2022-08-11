package JavaK86.core.Bai4;

public class ChangeValueNumber {
    public static void main(String[] args) {
        int a = 30;
        int b = 45;
        System.out.println("Truoc khi trao doi, gia tri cua a = " + a + " va b = " + b);
        // Trieu hoi phuong thuc hamTraoDoi hamTraoDoi(a, b);
        System.out.println("\n**Bay gio, Truoc va Sau khi trao doi, cac gia tri se giong nhu nhau o day**:");
        System.out.println("Sau khi trao doi, a = " + a + " va b = " + b);
    }

    public static void hamTraoDoi(int a, int b) {
        System.out.println("Truoc khi trao doi (ben trong phuong thuc) , a = " + a + " va b = " + b);
        // trao doi gia tri cua hai so int c = a; a = b; b = c;
        System.out.println("Sau khi trao doi (ben trong phuong thuc), a = " + a + " va b = " + b);
    }
}
