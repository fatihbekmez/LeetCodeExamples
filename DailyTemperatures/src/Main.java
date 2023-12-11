import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Gün sayısını: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Sıcaklık girin");
        for (int i = 0; i < a; i++) {
            dizi[i] = sc.nextInt();
        }

        int[] dizi2 = new int[a];
        int[] dizi3 = new int[a];
        int b = 0;
        int c = 0;

        for(int i = 0; i < a; i++){
            while (b > 0 && dizi[i] > dizi[dizi3[b]]){
                dizi2[dizi.length] = i - c;
            }
            dizi3[b++] = i;
        }
        System.out.println(Arrays.toString(dizi3));


    }
}