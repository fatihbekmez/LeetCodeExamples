import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Eleman sayısını girin");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Elemanları girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        int b = dizi[0];
        int peak = dizi[0];

        for(int k = 0; k < a; k++){
            if(b < dizi[k]){
                b = dizi[k];
            }

            peak = b;
            if(dizi[k] > peak ){
                peak = dizi[k];
            }
        }

        int c = dizi[0];

        for(int j = 0; j < a; j++){
            if(c > dizi[j]){
                c = dizi[j];
            }
        }


        System.out.println("En büyük eleman = " + b);

        int d = dizi[0];
        for(int i = 0; i<a; i++){
            if(d < c){
                d = dizi[i];
            }
        }

        System.out.println(peak);

    }
}