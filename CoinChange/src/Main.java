import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int a, b, sum, bakiye;
        Scanner sc = new Scanner(System.in);

        System.out.print("Bakiyeyi girin: ");
        b = sc.nextInt();

        System.out.print("Kaç eleman girilecek: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.print("Sayıları girin: ");
        for (int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        sum = 0;
        for (int i = 0; i < a; i++){
            sum += dizi[i];
        }

        if(b > sum){
            bakiye = sum - b;
        }
        else if (b == sum){
            bakiye = 0;
            System.out.println("İkisi de eşit paraya gerek yok");
        }
        else{
            bakiye = b - sum;
            System.out.println("para lazım :)");
        }

        System.out.println("Sahip olunan para " + sum + " TL");
        System.out.println("Girilen bakiye ulaşmak için gereken " + bakiye + " TL");
        System.out.println(Arrays.toString(dizi));
    }
}