import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b = 0,d =0;
        Scanner sc = new Scanner(System.in);

        System.out.print("10 ve 100 aralığında Sayıyı girin ");
        a = sc.nextInt();

        int[] c = new int[2];

        for (int i = 2 -1; i >= 0; i--){
            c[i] = a % 10;
        }

        if(c[0] < c[2-1]){
            c[1] = b;
            c[2] = d;
        }

        int ay = b + d;

        System.out.println(ay);
    }

}