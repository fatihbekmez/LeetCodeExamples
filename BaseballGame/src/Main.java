import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin: ");
        a = sc.nextInt();

        String[] dizi = new String[a];

        System.out.println("Elemanları girin: ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextLine();
        }

        for(int i = 0; i < a; i++){
            if (dizi[i] == "D"){
                dizi[i] = "*";
            }else if(dizi[i] == "C"){
                dizi[i] = "5";
            }
        }

        int[] dizi2 = new int[a];

        for(int i = 0; i < a; i++){
            dizi2[i] = Integer.parseInt(dizi[i]);
        }

        System.out.println("Yeni dizi " + dizi2);



    }
}