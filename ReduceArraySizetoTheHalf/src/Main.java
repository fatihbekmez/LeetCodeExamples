import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Elemanları girin: ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        int b = dizi[0];
        int c = 0;
        Arrays.sort(dizi);
        for(int i = 0; i < a; i++){
            if(b == dizi[i]){
                c++;
            }
        }

        int d = 0;
        if(c != dizi.length){
             d = (dizi.length - c) - 2;
        }else{
            d = 1;
        }

        System.out.println(d);

    }
}