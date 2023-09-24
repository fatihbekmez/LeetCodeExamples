import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısını girin: ");
        a = sc.nextInt();

        int [] dizi = new int[a];

        for(int i = 0; i < dizi.length; i++)
        {
            System.out.print((i+1) + ". Elemanı girin: ");
            dizi[i] = sc.nextInt();

            if(a>1) {
                dizi[1] = dizi[a - 1];
            }

        }
        System.out.println(Arrays.toString(dizi));
    }
}
