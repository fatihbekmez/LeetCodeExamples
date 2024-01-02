import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kişi sayısını girin: ");
        a = sc.nextInt();

        System.out.print("Para miktarını girin: ");
        b = sc.nextInt();


        int[] dizi = new int[a];

        System.out.println("Paraları girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        if(a == 1 && b > dizi[0]){
            System.out.println(0);
        }

        int toplam = 0;
        int count = 0;

        for(int j = 0; j < a; j++){
            toplam += dizi[j];

            if(toplam >= b){
                count++;
            }

            if(dizi[j] == b){
                count++;
            }


        }

        if(toplam != b){
            System.out.println(false);
        }

        System.out.println(toplam);
    }

}