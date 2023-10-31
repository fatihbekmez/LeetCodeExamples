import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);

        int dizi1[] = new int[4];
        int dizi2[] = new int[4];

        System.out.println("1. dikdörtgen için koordinatları girin: ");
        for(int i = 0; i < 4; i++){
            dizi1[i] = sc.nextInt();
        }

        System.out.println("2. dikdörtgen için koordinatları girin: ");
        for(int i = 0; i < 4; i++){
            dizi2[i] = sc.nextInt();
        }


        for(int i = 0; i < 4; i++){

             a = dizi1[i] + 1;

             if(a == dizi2[i]){
                 System.out.println(true);
             }
        }

        System.out.println(Arrays.toString(dizi2));

    }
}