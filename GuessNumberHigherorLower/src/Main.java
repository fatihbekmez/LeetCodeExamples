import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c,sayac = 0;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        b = r.nextInt(100);
        System.out.println(b);

        System.out.println("Bakiyeyi girin: ");
        c = sc.nextInt();

        for(int i = 0; i < b; i++){
            System.out.print("Sayıyı tahmin edin: ");
            a = sc.nextInt();
            if( a == b){
                System.out.println("True");
                sayac += 5;
                break;
            }else if( a < b){
                System.out.println("Yüksel");
                sayac++;
            }else if (a > b){
                System.out.println("Alçal");
                sayac++;
            }
        }

        if(c > sayac){
            System.out.println(c-sayac +" TL Kazandın.");
        }else if (c < sayac){
            System.out.println("Oyunu kazandın ama bakiyen yarışma için yeterli gelmedi. Borcun: " + (sayac-c));
        }

    }
}