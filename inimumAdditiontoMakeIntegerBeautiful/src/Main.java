import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c =0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayıyı girin: ");
        a = sc.nextInt();

        System.out.print("Hedefi girin: ");
        b = sc.nextInt();

        while(a > 0){
            int bk = a % 10;
            c += bk;
            a /= 10;
        }

        if(c == b){
            System.out.println(true);
        }else if (c > b){
            int fark = c - b;
            System.out.println("Aradaki fark: " + fark);
        }

    }
}