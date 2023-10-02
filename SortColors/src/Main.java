import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        int dizi[] = new int[3];

        System.out.println("0 -> Red, 1 -> White, 2 -> Blue");
        System.out.println("Renkleri girin: ");
        a = sc.nextInt();


        for (int i = 1; i < 3; i++) {
            dizi[i] = sc.nextInt();

        }


        if ( a >= 0 && a <= 2) {
            Arrays.sort(dizi);
            System.out.println(Arrays.toString(dizi));
        }else{
            System.out.println("Renklerin bağlı olduğu sayılar girilmelidir.");
        }
    }
}