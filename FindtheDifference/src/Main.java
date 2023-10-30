import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 1,b = 1;
        Scanner sc = new Scanner(System.in);



        String[] dizi1 = new String[a];
        String[] dizi2 = new String[b];

        System.out.println("Birinci dizinin elemanlarını girin: ");
        for (int i  = 0; i<a; i++){
            dizi1[i] = sc.nextLine();
        }

        System.out.println("İkinci dizinin elemanlarını girin: ");
        for (int i  = 0; i<b; i++){
            dizi1[2] = sc.nextLine();
        }


        if(a > b){
            for(int i = 0; i < b; i++){
                boolean b1 = dizi1[i] != dizi2[i];
                System.out.println(dizi1);
            }
        }else if (b > a){
            for(int i = 0; i < a; i++){
                boolean b1 = dizi1[i] != dizi2[i];
                System.out.println(dizi1);
            }
        }
    }
}