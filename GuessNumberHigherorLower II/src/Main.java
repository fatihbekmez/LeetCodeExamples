import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,count = 0;
        Scanner sc = new Scanner(System.in);

        Random r = new Random();
        b = r.nextInt(200);

        System.out.println(b);

        System.out.print("Tahminizi girin: ");
        a = sc.nextInt();


        for (int i = 0; i < 200; i++) {

            if (a < b) {
                System.out.println("Tahmin ettiğiniz sayı hedef sayının altında");
                System.out.print("Tahminizi girin: ");
                a = sc.nextInt();
                count++;
            }else if (b < a){
                System.out.println("Tahmin ettiğiniz sayı hedef sayının üstünde");
                System.out.print("Tahminizi girin: ");
                a = sc.nextInt();
                count++;
            }else{
                System.out.println("Sayıyı buldunuz. ");
                break;
            }
        }

        System.out.println("Borcunuz: " + count);
    }
}