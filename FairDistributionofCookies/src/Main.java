import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Torba sayısını girin: ");
        a = sc.nextInt();


        int[] dizi = new int[a];
        System.out.println("Kurabiye sayılarını girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        b = dizi.length / 2;
        int[] dizi2 = new int[b];
        int[] dizi3 = new int[dizi.length-b];


        for(int i = 0; i < b;i++){
            dizi2[i] = dizi[i];
        }

        for(int i = 0; i < dizi.length - b;i++){
            dizi3[i] = dizi[i + b];
        }

        Arrays.sort(dizi2);
        Arrays.sort(dizi3);

        int c1 = dizi2[dizi2.length-1];
        int c2 = dizi3[dizi3.length-1];

        if(c1 > c2){
            System.out.println(c1);
        }else{
            System.out.println(c2);
        }
    }
}

