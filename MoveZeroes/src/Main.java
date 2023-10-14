import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
        System.out.println(Arrays.toString(dizi));


    }
}