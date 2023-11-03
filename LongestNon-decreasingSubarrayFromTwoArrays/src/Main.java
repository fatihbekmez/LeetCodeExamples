import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dizilerin boyutlarını girin: ");
        a = sc.nextInt();

        int[] dizi1 = new int[a];
        int[] dizi2 = new int[a];
        int[] dizi3 = new int[a];

        System.out.println("Birinci dizinin elemanları girin");
        for(int i = 0; i < a; i++){
            dizi1[i] = sc.nextInt();
        }

        System.out.println("İkinci dizinin elemanları girin");
        for(int i = 0; i < a; i++){
            dizi2[i] = sc.nextInt();
        }

        for(int i = 0; i < a; i++){
            if(dizi1[i] > dizi2[i]){
                dizi3[i] = dizi1[i];
            }else{
                dizi3[i] = dizi2[i];
            }
        }

        int c = dizi3[0];

        for(int i = 0; i < a; i++){
            if(c < dizi3[i]){
                b++;
            }
        }

        if(b == a){
            System.out.println(true);
        }else{
            System.out.println(false);
        }




        System.out.println(Arrays.toString(dizi1));
        System.out.println(Arrays.toString(dizi2));
        System.out.println(Arrays.toString(dizi3));
    }
}