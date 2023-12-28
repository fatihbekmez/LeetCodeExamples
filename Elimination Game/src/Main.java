import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c,d,e = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayıyı girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        for(int i = 0; i < a; i++){
            dizi[i] = i+1;
        }

        if(a < 100) {
            int[] dizi2 = new int[b = a / 2];
            for (int i = 0; i <= b; i++) {
                dizi2[i] = dizi[i++];
            }
            int[] dizi3 = new int[c = b / 2];
            for (int i = 0; i <= c; i++) {
                dizi3[i] = dizi2[i++];
            }
            int[] dizi4;
            if (c > 3) {
                dizi4 = new int[d = c / 2];
                for (int i = 0; i < d; i++) {
                    dizi4[i] = dizi3[i++];
                }
            }else{
                System.out.println(Arrays.toString(dizi3));
            }

        }  else if(a >= 100){

            int[] dizi2 = new int[b = a / 2];
            for (int i = 0; i <= b; i++) {
                dizi2[i] = dizi[i++];
            }
            int[] dizi3 = new int[c = b / 2];
            for (int i = 0; i <= c; i++) {
                dizi3[i] = dizi2[i++];
            }
            int[] dizi4 = new int[d = c/ 2];
            for (int i = 0; i < d; i++) {
                dizi4[i] = dizi3[i++];
            }

            int[] dizi5 = new int[e];
            if (d > 3) {
                for (int i = 0; i < e; i++) {
                    dizi5[i] = dizi4[i++];
                }
            }else{
                System.out.println(Arrays.toString(dizi4));
            }


        }

        System.out.println(Arrays.toString(dizi));
    }

}