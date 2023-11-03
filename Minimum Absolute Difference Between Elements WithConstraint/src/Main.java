import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin: ");
        a = sc.nextInt();

        System.out.print("Dizi aralığını girin: ");
        b = sc.nextInt();

        for(int i = 0; i < 100; i++) {
            if (b > a) {
                System.out.println("Hedef dizi boyutundan büyük olamaz !");
                System.out.print("Dizi aralığını girin: ");
                b = sc.nextInt();
            }
        }

        int[] dizi = new int[a];

        c = dizi[0];

        System.out.println("Elemanları girin: ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }


        Arrays.sort(dizi);


            for (int i = 0; i < b; i++) {
                c -= dizi[0];
            }


        System.out.println(Math.abs(c));

    }
}