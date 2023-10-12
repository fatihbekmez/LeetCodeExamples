import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        int[] dizi = new int[3];
        for (int i = 0; i < 3 ; i++){
            System.out.print("Sayı " + (i+1) + " : ");
            dizi[i] = sc.nextInt();
        }

        System.out.println("("+dizi[0]+"/"+ "(" + dizi[1] + "+" + dizi[2] + ")" + ")");

        double b = dizi[0]/(dizi[1]+dizi[2]);
        System.out.println("Sonuç: " + b );
    }
}