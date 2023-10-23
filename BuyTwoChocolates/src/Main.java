import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        int[] dizi = new int[3];


        System.out.println("Çikolata fiyatlarını girin: ");
        for (int i = 0; i < 3; i++) {
               dizi[i] = sc.nextInt();
        }

        System.out.println("Bütçeyi girin: ");
        a = sc.nextInt();

        int t = dizi[0] + dizi[1];
        int t1 = dizi[1] + dizi[2];
        int t2 = dizi[0] + dizi[2];

        if(t < 3 || t1 < 3 || t2 < 3){
            System.out.println("Çikolota alındı");
        }else{
            System.out.println("Bütçe 2 çikolata almaya yetmiyor");
        }
    }
}