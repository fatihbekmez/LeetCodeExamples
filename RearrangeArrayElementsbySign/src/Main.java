import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        int[] kdizi = new int[a/2];
        int[] bdizi = new int[a/2];

        System.out.print("Elemanları girin: ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        Arrays.sort(dizi);

        for(int i = 0; i < a/2 ; i++){
            kdizi[i] = dizi[i];
        }

        for(int i = 0; i < a/2; i++){
            bdizi[i] = dizi[dizi.length-a/2 +i];
        }

        int[] yeniDizi = new int[a];

        for(int i = 0; i < a; i++){
            yeniDizi[i]  = bdizi[i];
            yeniDizi[i + 1] = kdizi[i];
        }

        System.out.println(Arrays.toString(dizi));
        System.out.println(Arrays.toString(kdizi));
        System.out.println(Arrays.toString(bdizi));
        System.out.println(Arrays.toString(yeniDizi));
    }
}