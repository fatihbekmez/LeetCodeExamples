import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci dizenin eleman sayısını girin: ");
        a = sc.nextInt();

        System.out.print("İkinci dizinin eleman sayısını girin: ");
        b = sc.nextInt();

        int[] dizi1 = new int[a];
        int[] dizi2 = new int[b];

        if (dizi1.length == dizi2.length) {
            if (a > 0 && b > 0) {
                System.out.print("Birinci dizinin elemanlarını girin: ");
                for (int i = 0; i < a; i++) {
                    dizi1[i] = sc.nextInt();
                }

                System.out.print("İkinci dizinin elemanlarını girin: ");
                for (int j = 0; j < b; j++) {
                    dizi2[j] = sc.nextInt();
                }
            } else {
                System.out.println("Eleman sayıları sıfırdan büyük olmalıdır.");
            }

            Boolean isEsit = dizi1.equals(dizi2);

            System.out.println(isEsit);
        }
        else{
            System.out.println(false);
        }
    }
}