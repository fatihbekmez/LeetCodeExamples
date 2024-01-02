import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin: ");
        a = sc.nextInt();

        System.out.print("Hedefi girin: ");
        b = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Elemanları girin");
        for (int i = 0; i < a; i++) {
            dizi[i] = sc.nextInt();
        }

        int toplam = 0;
        int count = 0;

        for (int j = 0; j < a; j++) {
            toplam += dizi[j];

            if (toplam < b) {
                System.out.println(false + " " + 0);
                break;
            }
        }


        int[] newDizi = new int[0];
        for (int i = 0; i < a-2; i++) {
            newDizi = Arrays.copyOfRange(dizi, i, i+2);

            for(int j = 0; i < newDizi.length; j++){
                toplam += newDizi[j];
                if(toplam == b){
                    count++;
                }
            }
        }


        //System.out.println(Arrays.toString(dizi));
        System.out.println(toplam);
        System.out.println(count);


    }
}