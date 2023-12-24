import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Eleman sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Elemanları girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        int[] dizi2 = new int[a*2];
        if(a == 1){
            System.out.println(Arrays.toString(dizi));
        }else{


            for(int i = 0; i < a; i++){
                dizi2[i] = dizi[i];
            }
        }

        System.out.println(Arrays.toString(dizi2));
    }
}