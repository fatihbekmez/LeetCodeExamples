import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("İlk Dizinin eleman sayısını girin: ");
        a = sc.nextInt();

        System.out.print("İkinci dizinin eleman sayısını girin: ");
        b = sc.nextInt();

        int[] dizi1 = new int[a];
        int[] dizi2 = new int[b];

        System.out.println("İlk dizinin elemanlarını girin: ");
        for(int i = 0; i < a; i++){
            dizi1[i] = sc.nextInt();
        }

        System.out.println("İkinci dizinin elemanlarını girin: ");
        for(int i = 0; i < a; i++){
            dizi2[i] = sc.nextInt();
        }

        int c = 0;

        for(int i = 0; i < a; i++){
            if(dizi1[i] == dizi2[i]){
                c++;
            }
        }

        if(c == 2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}