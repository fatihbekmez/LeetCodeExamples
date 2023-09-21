import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        int a,b;
        double c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayıyı girin: ");
        a = sc.nextInt();

        System.out.print("Böleni girin: ");
        b = sc.nextInt();

        c = (double)(a / b);
        if (c <= c + 0.5) {
            System.out.println(Math.round(c));
        } else if (c > c + 0.5) {
            System.out.println(c + 1.0);
        }

    }
}
