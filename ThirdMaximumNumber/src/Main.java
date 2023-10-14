import java.util.Arrays;
import java.util.Collections;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Yazılacak dizinin eleman sayısını yazın: ");
        a = sc.nextInt();
        int dizi[] = new int[a];

        for(int i= 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        Arrays.sort(dizi);
        Collections.reverse(Arrays.asList(dizi));

        if(a == 1){
            System.out.println(dizi[0]);
        }
        else if(a == 2){
            System.out.println("Dizi iki elemanlı olduğu için en büyük eleman: " + dizi[1]);
        }
        else{
            System.out.println("Dizinin en büyük üçüncü elemanı: "+ dizi[a-3]);
        }


    }
}