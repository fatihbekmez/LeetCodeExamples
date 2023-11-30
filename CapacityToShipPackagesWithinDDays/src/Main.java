import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Yük sayısını girin: ");
        a = sc.nextInt();

        System.out.print("Gün sayısını girin: ");
        b = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Ağırlıkları girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }


        int toplam = 0;
        for(int i = 0; i < a; i++){
            toplam += dizi[i];
        }

        int c = dizi[0];
        for(int i = 0; i < a; i++){
            if(c < dizi[i]){
                c = dizi[i];
            }
        }

        int d = dizi[0];
        for(int i = 0; i < a; i++){
            if(d > dizi[i]){
                d = dizi[i];
            }
        }

        Arrays.sort(dizi);
        int ort = toplam / a;

        int ytop = 0;
        int say = 0;
        for(int i = 0; i < a; i++){
            ytop += dizi[i];
            if(ytop >= ort){
                say++;
            }
        }

        System.out.println(say);

        System.out.println(c);
        System.out.println(d);
        System.out.println(toplam);
    }

}