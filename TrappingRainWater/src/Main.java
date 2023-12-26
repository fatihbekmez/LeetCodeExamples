import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Çukur sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.print("Çukur derinliklerini girin: ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();

        }

        if(a == 0){
            System.out.println("çukur sayısı 0 girildi.");
        }


        int toplam = 0;
        int fark = 0;
        for(int i = 0; i < dizi.length -1 ; i++){
            if(dizi[i] > dizi[i + 1]){
                    fark += dizi[i + 1] - dizi[i];
            }
        }

        toplam += fark;
        System.out.println(Math.abs(toplam));
    }
}