import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];
        int[] dizi2 =new int[a];

        System.out.print("Elemanları girin: ");
        for(int i = 0; i < a; i++){
            dizi[i]  = sc.nextInt();
        }


        for (int i=0; i<dizi.length; i++)
        {
            dizi2[dizi[i]-1]++;

            if (dizi2[dizi[i]-1] > 1)
                dizi[i]=0;
        }

        for (int i=0; i<dizi.length; i++)
        {
            if (dizi[i] != 0)
                System.out.print(dizi[i]+" ");
        }

    }
}