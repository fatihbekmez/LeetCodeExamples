import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Torba sayısını girin: ");
        a = sc.nextInt();

        int [] dizi = new int[a];

        System.out.println("Taş miktarlarını girin");

        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }


        int atop = 0;
        for(int i = 0; i < a/2; i++){
            atop += dizi[i];
        }



        int btop = 0;
        for(int i = 0; i < a/2; i++){
            Arrays.sort(dizi);
            btop += dizi[i];
        }


        if(atop > btop){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}