import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci dizinin eleman sayısını girin: ");
        a = sc.nextInt();

        System.out.print("İkinci dizinin eleman sayısını girin: ");
        b = sc.nextInt();

        int[] dizi1 = new int[a];
        int[] dizi2 = new int[b];
        int[] fnl = new int[dizi1.length + dizi2.length];

        System.out.println("Birinci dizinin elemanlarını girin: ");
        for(int i = 0; i < a; i++){
            dizi1[i] = sc.nextInt();
        }

        System.out.println("İkinci dizinin elemanlarını girin: ");
        for(int i = 0; i < b; i++){
            dizi1[i] = sc.nextInt();
        }

        for(int i = 0; i < dizi1.length + dizi2.length; i++){

            if (i<dizi1.length){
                fnl[i] =dizi1[i];
            }else{
                fnl[i] =dizi2[i-dizi1.length];
            }
        }

        System.out.println(Arrays.toString(fnl));
    }
}
