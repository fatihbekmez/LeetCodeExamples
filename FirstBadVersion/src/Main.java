import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b,c,d;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sürümü girin: ");
        a = sc.nextInt();

        System.out.print("Hatalı versiyonu girin: ");
        b = sc.nextInt();

        if (a == b){
            System.out.println(false);
        }
        else if (a > b){
            c = a - b;
            d = a - c;
            System.out.println("İlk hatalı versiyon " + d);
        }
        else{
            System.out.println("Sürüm hatalı versiyonda düşük olamaz.");
        }
    }
}