import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Eleman sayısını girin");
        a = sc.nextInt();

        int[] dizi = new int[a];


        System.out.println("Elemanları girin: ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }


        int b = 0;
        int c = dizi[0];
        int d = dizi[0];

        if(a < 4){
            System.out.println(false);
        }else if(a == 4){
            b = (dizi[0] * dizi[1]) - (dizi[2] * dizi[3]);
            System.out.println(b);
        }else{

            for(int i = 0; i < a; i++){
                if(c < dizi[i]){
                    c = dizi[i];
                }
                if(d > dizi[i]){
                    d = dizi[i];
                }
            }
        }

        Arrays.sort(dizi);
        b = (dizi[dizi.length - 1]*dizi[dizi.length-2]) - (dizi[0] - dizi[1]);
        System.out.println(b);
    }
}