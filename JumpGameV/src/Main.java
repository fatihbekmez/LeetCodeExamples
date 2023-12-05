import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {

        int a,b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Zıplama sayısını girin: ");
        a = sc.nextInt();

        System.out.print("Yükselik sayısını girin: ");
        b = sc.nextInt();

        int dizi[] = new int[b];

        System.out.print("Yükseltileri girin: ");
        for(int i = 0; i < b; i++){
            dizi[i] = sc.nextInt();
        }

        if(a > b){
            System.out.println(false);
        }

        c = 0;

        for(int i = 0; i < b; i++){
            if (dizi[b - i] > dizi[b - 2*i]){
                    c++;
            }
        }

        System.out.println(c);
    }
}