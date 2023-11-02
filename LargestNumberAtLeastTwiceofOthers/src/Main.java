import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("ELeman sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Elemanları girin: ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        Arrays.sort(dizi);

        for(int i = 0; i < a; i++){
            if((dizi[a-1] / 2) >= dizi[i]){
                System.out.println("1");
            }else{
                System.out.println("-1");
            }
        }
    }
}