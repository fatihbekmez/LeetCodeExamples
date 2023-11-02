import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci dizi için kelime sayısını girin: ");
        a = sc.nextInt();

        System.out.print("İkinci dizi için kelime sayısını girin: ");
        b = sc.nextInt();

        String[] dizi1 = new String[a];
        String[] dizi2 = new String[b];

        String c = dizi1[0];
        String d = dizi2[0];

        System.out.println("Birinci dizinin kelimelerini girin: ");
        for(int i = 0; i < a; i++){
            dizi1[i] = sc.nextLine();
        }

        System.out.println("İkinci dizinin kelimelerini girin: ");
        for(int i = 0; i < b; i++){
            dizi2[i] = sc.nextLine();
        }

        if (dizi1 == null || dizi2 == null || dizi1.length == 0 || dizi2.length == 0 ){
            return;
        }

        for(int i = 1; i < dizi1.length; i++){
            if(dizi1[i].length() < c.length()){
                c = dizi1[i];
            }
        }

        for(int i = 1; i < dizi2.length; i++){
            if(dizi2[i].length() < c.length()){
                d = dizi2[i];
            }
        }

        System.out.println(c);
        System.out.println(d);

    }
}