import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        if(a > 1 && a <= 500) {
            for (int i = 0; i < dizi.length; i++) {
                System.out.print((i + 1) + ". Elemanı girin: ");
                dizi[i] = sc.nextInt();
            }
            Arrays.sort (dizi);
            System.out.println(Arrays.toString(dizi));
        }
        else{
            System.out.println("Girilen eleman sayısı 1 ile 500 arasında olmalıdır.");
        }

    }
}