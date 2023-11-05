import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Elemanları girin: ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        b = dizi.length / 2;
        int[] dizi2 = new int[b];
        int[] dizi3 = new int[dizi.length-b];


        for(int i = 0; i < b;i++){
            dizi2[i] = dizi[i];
        }

        for(int i = 0; i < dizi.length - b;i++){
            dizi3[i] = dizi[i + b];
        }

        Arrays.sort(dizi2);
        Arrays.sort(dizi3);

        int t = dizi2[dizi.length-1] - dizi2[0];
        int t2 = dizi3[dizi.length-1] - dizi3[0];

        int ttl = t + t2;
        System.out.println(ttl);
    }
}

