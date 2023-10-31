import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        String b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Basılan tuşları girin: ");
        b = sc.nextLine();

        int[] dizi = new int[b.length()];

        System.out.println("Dakikaları girin: ");
        for (int i = 0; i < b.length(); i++){
            dizi[i] = sc.nextInt();
            dizi[i] = b.charAt(i);
        }


        for(int i = 0; i < b.length(); i++){
            Arrays.sort(dizi);
            dizi[i] = b.charAt(i);
        }

        System.out.println(b.charAt(0));
    }
}