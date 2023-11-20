import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dizi eleman sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.print("Elemanları girin: ");
        for (int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        int b = dizi[0];

        for(int i = 0; i < a; i++){
            if(dizi[i] < b){
                dizi[i] = b;
            }
        }

        int c = dizi[0];

        for(int i = 0; i < a; i++){
            if(dizi[i] > c){
                dizi[i] = c;
            }
        }

        System.out.println("En büyük eleman " + b +" " + "en küçük eleman " + c);


    }
}