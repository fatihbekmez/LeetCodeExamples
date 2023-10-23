import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b;
        int abol = 0, bbol = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        a = sc.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        b = sc.nextInt();


        if(a > 0 || b > 0){
            for (int i = 1; i <=a ; i++){
                if (a % i != 0){
                    abol += i;
                }
            }
            for (int i = 1; i<= b; i++){
                if (b % i != 0){
                    bbol += i;
                }
            }
        }else{
            System.out.println("Sayılar 0'dan büyük olmalıdır.");
        }

        System.out.println("Birinci sayıya tam bölünmeyen sayıların toplamı: " + abol);
        System.out.println("İkinci sayıya tam bölünmeyen sayıların toplamı: " + bbol);
    }
}