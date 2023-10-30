import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci dizenin eleman sayısını girin: ");
        a = sc.nextInt();

        System.out.print("İkinci dizinin eleman sayısını girin: ");
        b = sc.nextInt();

        int[] dizi1 = new int[a];
        int[] dizi2 = new int[b];

        System.out.println("Birinci dizinin elemanlarını girin: ");
        for (int i = 0; i < a; i++){
            dizi1[i] = sc.nextInt();
        }

        System.out.println("İkinci dizinin elemanlarını girin: ");
        for (int i = 0; i < b; i++){
            dizi2[i] = sc.nextInt();
        }

        if(a > b){
            for(int i = 0; i < b; i++){
                dizi1[i] = dizi2[i];
                System.out.println(dizi1[i]);
            }
        }else if (b > a){
            for (int i = 0; i < a; i++){
                dizi1[i] = dizi2[i];
                System.out.println(dizi1[i]);
            }

        }
    }
}