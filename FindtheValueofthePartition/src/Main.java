import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;

        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısı girin: ");
        a = sc.nextInt();

        int b = a/2;
        int[] dizi = new int[a];
        int[] dizi2 = new int[b];
        int[] dizi3 = new int[b];

        System.out.println("Elemanları girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }


        for(int i = 0; i < b; i++){
            dizi2[i] = dizi[i];
            dizi3[i] = dizi[i + b];
        }

        int c = dizi2[0];
        int d = dizi3[0];

        for(int i = 0; i < dizi2.length;i++){
            if(dizi2[i] > c){
                c = dizi2[i];
            }
        }

        for(int i = 0; i < dizi3.length;i++){
            if(dizi3[i] > c){
                d = dizi3[i];
            }
        }

        int sonuc = c - d;

        System.out.println(Math.abs(sonuc));

    }
}