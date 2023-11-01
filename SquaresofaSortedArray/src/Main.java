import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Eleman sayısı girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Elemanları yazın: ");
        for(int i = 0;i < a;i++){
            dizi[i] = sc.nextInt();
        }

        Arrays.sort(dizi);
        for(int i = 0; i <a; i++){
            b = dizi[i] * dizi[i];
        }

        System.out.println(b);
    }
}