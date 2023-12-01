import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b=0;
        Scanner sc = new Scanner(System.in);


        System.out.print("İşlem ücretini girin: ");
        a = sc.nextInt();

        int[] dizi = new int[6];

        System.out.println("Hisse ücretlerini girin");
        for(int i = 0; i < 6; i++){
            dizi[i] = sc.nextInt();
        }

        Arrays.sort(dizi);

        for(int i = 0; i < 6; i++){
            b = dizi[i] - dizi[6-i] - a;
        }


        System.out.println("Kar : " + b);

    }
}