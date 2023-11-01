import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c= 0,d = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayıyı girin: ");
        a = sc.nextInt();

        System.out.print("Böleni girin: ");
        b = sc.nextInt();

        if(a > b) {
            if (b < 0) {
                Math.abs(b);
                for (int i = 1; i < a; i += b) {
                    c++;
                    d = c * -1;
                }
            } else {
                for (int i = 1; i < a; i += b) {
                    c++;
                    d = c;
                }
            }
        }


        System.out.println(d);
    }
}