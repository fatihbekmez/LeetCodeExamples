import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c, d = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ana tankın miktarını girin: ");
        a = sc.nextInt();

        System.out.print("Yedek tankın miktarını girin: ");
        b = sc.nextInt();

        if (a >= 5){
            c = a / 5;
            if (c < 5){
                d = 1;
            }
            int mesafe = (a*10) + (d*10);
            System.out.println("Gidilecek mesafe: " + mesafe + "KM");
        }
        else if( a < 5){
            int mesafe = a*10;
            System.out.println("Gidileck mesafe: " + mesafe + "KM");
        }
    }
}