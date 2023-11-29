import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        int a;


        Scanner sc = new Scanner(System.in);

        System.out.println("Kişi sayısını girin: ");
        a = sc.nextInt();

        int[] boy = new int[a];
        String[] kisi = new String[a];


        System.out.println("İsimleri girin");
        for(int i = 0; i < a; i++){
            kisi[i] = sc.nextLine();
        }

        System.out.println("Boyları girin");
        for(int i = 0; i < a; i++){
            boy[i] = sc.nextInt();
        }

        int b = boy[0];

        for(int i = 0; i < a; i++){
            if(b > boy[i]){
                b = boy[i];
            }
        }

        System.out.println(b);

        for(int i = 0; i < a; i++) {
            if (b == boy[i]) {
                System.out.println(i);
                System.out.println(kisi[i]);
            }
        }

        int c = boy[0];

        for(int i = 0; i < a; i++){
            if(c > boy[i]){
                c = boy[i];
            }
        }

        for(int i = 0; i < a; i++) {
            if (c == boy[i]) {
                System.out.println(c);
                System.out.println(kisi[i]);
            }
        }



    }
}