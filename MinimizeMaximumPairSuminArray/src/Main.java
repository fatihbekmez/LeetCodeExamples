import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        int[] dizi1 = new int[a/2];
        int[] dizi2 = new int[a/2];

        System.out.println("Elemanları girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        for(int i = 0; i < a/2 ; i++){
            dizi1[i] = dizi[i*2];
        }

        for(int i = 0; i < a/ 2; i++){
            dizi2[i] = dizi[i*2+1];
        }

        int b = 0;

        for(int i = 0; i < dizi1.length ; i++){
            b += i;
        }

        int toplam = Arrays.stream(dizi1).sum();
        int toplam2 = Arrays.stream(dizi2).sum();

        if(toplam2 > toplam){
            System.out.println(toplam2);
        }else{
            System.out.println(toplam);
        }


        System.out.println(Arrays.toString(dizi));
        System.out.println(Arrays.toString(dizi1));
        System.out.println(Arrays.toString(dizi2));

    }
}