import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);


        System.out.print("Ev Sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Evlerde bulunan parayı girin: ");
        for (int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        int ev = 2;
        int top = 0;

        for (int i = 0; i < dizi.length; i += ev){
            top += dizi[i];
        }

        System.out.println("Çalınan para :) : "+ top + "TL");
    }
}