import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayılarını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Sayıları girin: ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        for(int i = 0; i <a; i++){
            if(dizi[i] == dizi[i+1]){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }

    }
}