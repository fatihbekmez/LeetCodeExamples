import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Elemanlarını girin: ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        Arrays.sort(dizi);

        for(int i=0; i<dizi.length; i++)
        {
            b=0;

            for (int j=0; j<dizi.length; j++)
            {
                if(dizi[i]==dizi[j])
                {
                    b++;
                }
            }

            if(i == 0 && dizi[i+1] == dizi[i]){
                System.out.println(dizi[i]);
            }

        }
    }
}