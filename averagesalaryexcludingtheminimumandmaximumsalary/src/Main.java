import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,min,maks,top = 0, fark, ort;
        Scanner sc = new Scanner(System.in);

        System.out.print("Çalışan sayısını giriniz: ");
        a = sc.nextInt();

        int[] dizi = new int[a];
        System.out.print("Maaşları giriniz: ");
        for (int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        System.out.println("Maaşlar: " + Arrays.toString(dizi));

        maks = dizi[0];
        for(int i = 1; i < a; i++){
            if(dizi[i] > maks){
                maks = dizi[i];
            }
        }

        min = dizi[0];
        for(int i = 1; i < a; i++){
            if(dizi[i] < min){
                min = dizi[i];
            }
        }

        for (int i = 0; i < a; i++){
            top += dizi[i];
        }

        fark = top - (min + maks);

        ort = fark / (a-2);
        System.out.println("Maaş ortalaması: " + ort);
    }
}