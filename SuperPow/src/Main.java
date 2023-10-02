import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b;
        double us;
        Scanner sc = new Scanner(System.in);

        System.out.print("Girilen sayı kaç basamaklı: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.print("Sayıların girin: ");
        for (int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        b = 0;
        for (int basamak : dizi){
            b = b * 10 + basamak;
        }

        System.out.println(b);

        us =Math.pow(a, dizi[0]);


        System.out.println(us);
    }
}