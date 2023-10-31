import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        int a,b,c,d;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin: ");
        a = sc.nextInt();

        System.out.println("İşlem sayısını girin: ");
        b = sc.nextInt();

        int[] dizi = new int[a];

        c = dizi[0];

        System.out.println("Sayıları girin: ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        if (b < a) {
            for (int j = 0; j < b; j++){
                for (int i = 0; i < dizi.length; i++){
                    if(dizi[i] > c){
                        c = dizi[i];
                    }
                }
            }
        }

        Arrays.sort(dizi);
        d = a-b;
        System.out.println("En büyük ikinci eleman: " + dizi[a -d]);

    }
}