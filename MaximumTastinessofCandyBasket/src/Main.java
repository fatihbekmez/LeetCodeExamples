import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Şeker sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Fiyatları girin ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        int b = dizi[0];
        int c = dizi[0];

        for(int i = 0; i < a; i++){
            if(dizi[i] > b){
                b = dizi[i];
            }
        }

        for(int i = 0; i < a; i++){
            if(dizi[i] < c){
                c = dizi[i];
            }
        }

        int fark = b - c;
        System.out.println(Math.abs(fark));
    }
}