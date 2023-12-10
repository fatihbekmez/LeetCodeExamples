import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];
        List<Integer> diziEleman = new ArrayList<>();

        System.out.println("Elemanları girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }


        Arrays.sort(dizi);
        for(int i = 0; i < dizi.length - 1 ; i++){
            if(dizi[i] == dizi[i +1]){
                diziEleman.add(dizi[i]);
            }
        }

        int b = diziEleman.size();
        int[] dizi2 = new int[b];

        for(int i = 0; i < b; i++){
            dizi2[i] = diziEleman.get(i);
        }


        System.out.println(Arrays.toString(dizi2));

    }
}