import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c,d;
        Scanner sc = new Scanner(System.in);

        System.out.print("Gün sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Fiyatları girin: ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        b = dizi[0];
        c = dizi[0];

        for(int i = 0; i < a; i++){
            if(dizi[i] > b){
                b = dizi[i];
            }

            if(dizi[i] < c){
                c = dizi[i];
            }
        }

        d = c - b;
        System.out.println("Satın almak için en uygun gündeki fiyat: " + c);
        System.out.println("Satmak için en uygun gündeki fiyat: " + b);
        System.out.println("Kar: " + Math.abs(d));

    }
}