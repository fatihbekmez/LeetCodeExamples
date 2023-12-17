import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin: ");
        a = sc.nextInt();

        int dizi[] = new int[a];

        System.out.println("Elemanları girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        if(dizi.length == 1 || dizi.length >= 20){
            System.out.println(false);
        }


        if(dizi.length == 2){
            if(dizi[0] == 1){
                System.out.println(false);
            }
        }else if(dizi[0] == dizi[1]){
            System.out.println(false);
        }


        int b = 0;

        for(int i = 0; i < a; i++){
            if(b < dizi[i]){
                b = dizi[i];
            }
        }

        int c = 0;
        for(int j = 0; j < a; j++){
            if(c > dizi[j]){
                c = dizi[j];
            }
        }


        Arrays.sort(dizi);

        int d = 0;
        for(int i = 0; i < dizi.length/2 ; i++){
            d += dizi[i];
        }

        int f = (dizi.length/2);
       int e = 0;
        for(int k = f; k < dizi.length -1; k++){
            e += dizi[k];
            System.out.println(k);
        }

        if(d == e){
            System.out.println(true);
        }else{
            if((e + b) == d){
                System.out.println(true);
            }
            else if(d + b == e){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }

    }

}