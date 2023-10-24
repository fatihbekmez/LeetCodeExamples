import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,maks,min;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını giriniz: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Dizinin elemanlarını giriniz: ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        maks = dizi[0];
        for(int i = 0; i < a; i++){
            if(dizi[i] > maks){
                maks = dizi[i];
            }
        }

        min = dizi[0];
        for (int i = 0; i < a; i++){
            if(dizi[i] < min){
                min = dizi[i];
            }
        }

        Arrays.sort(dizi);

        if((maks * min) > 0){
            int carp = maks*min;
            System.out.println(carp);
        }else{
            System.out.println("0");
        }

    }
}