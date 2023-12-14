import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);


        System.out.print("Pancake sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Miktarları girin ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        for(int i = 0; i < a; i++){
            dizi[a - 1] = dizi[0];
            System.out.println(Arrays.toString(dizi));

        }



    }
}