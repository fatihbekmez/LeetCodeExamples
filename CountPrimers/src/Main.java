import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int sayac = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayıyı girin: ");
        a = sc.nextInt();

        for(int sayi=2;sayi<=a;sayi++) {

            int kontrol = 0;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    kontrol = 1;
                    break;
                }
            }

            if(kontrol==0) {
                System.out.print(sayi+"\n");
                sayac++;
            }
        }

    }
}