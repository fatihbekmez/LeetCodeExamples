
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Müşteri sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Değerlendirmeleri girin");
        for(int i = 0; i < a;i++) {
            dizi[i] = sc.nextInt();
        }

        int b = dizi[0];
        int c = 0;
        for(int j = 0; j < a; j++){
            if(b > dizi[j]){
                c = 0;
            }else{
                c = 1;
            }
        }
        
        if(c == 0) {
            Arrays.sort(dizi);
        }


        int d = 1;
        int e = 0;

        int f = 0;
        for(int i = 0; i < a; i++){
            if(dizi[i] < 0){
                f++;
            }
            for(int k = f; f < a; k++){
                e += dizi[k]*d;
                d++;
            }
        }

        System.out.println(f);


        System.out.println("**************");
        System.out.println(e);
    }
}