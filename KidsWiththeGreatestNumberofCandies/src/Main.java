import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,maks=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Çocuk sayısının giriniz: ");
        a = sc.nextInt();

        System.out.print("Ekstra şeker sayısını girin: ");
        b = sc.nextInt();

        int[] dizi = new int[a];
        System.out.print("Çocukların şekerlerini girin: ");
        for (int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }
        System.out.println("Şekerler Mevcut Şekerler: " + Arrays.toString(dizi));

        for(int i = 1; i < a; i++){
            if (dizi[i] > maks){
                maks = dizi[i];
            }
        }


        for(int i = 0; i < a; i++){
            int c = dizi[i] += b;
            if(c >= maks){
                System.out.println("Ekstra Şekerler sonrası durum: " + dizi[i] + " True");
            }else{
                System.out.println("Ekstra Şekerler sonrası durum: " + dizi[i] + " False");
            }
        }
    }
}