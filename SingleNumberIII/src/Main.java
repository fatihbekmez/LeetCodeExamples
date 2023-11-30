import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Elemanları girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        Arrays.sort(dizi);

        int b = 0;
        for(int i = 0; i < a; i++){
            b = 0;
            for(int j  = 0; j < a; j++){
                if(dizi[i] == dizi[j]){
                    b++;
                }
            }

            if(i == 0 && dizi[i+1] == dizi[i]){
                System.out.println(dizi[i]);
            }

            if(i == 0 && dizi[i+1] != dizi[i]){
                System.out.println(dizi[i]);
            }
        }
    }
}