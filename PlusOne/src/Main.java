import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayının basamak sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Sayıyı basamak basamak girin");
        for (int i = 0; i < a; i++) {
            dizi[i] = sc.nextInt();
        }

        b = dizi[a-1] + 1;

        dizi[a-1] = b;

        System.out.println(Arrays.toString(dizi));
    }
}