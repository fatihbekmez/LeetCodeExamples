import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Benzinlik sayısını girin: ");
        a = sc.nextInt();

        
        int[] dizi1 = new int[a];
        int[] dizi2 = new int[a];

        System.out.println("Benzin istasyonudaki miktarları girin: ");
        for(int i = 0; i < a; i++){
            dizi1[i] = sc.nextInt();
        }

        System.out.println("Maliyetleri girin: ");
        for(int i = 0; i < a; i++){
            dizi2[i] = sc.nextInt();
        }

        for(int i = 0; i<a; i++){

            b = dizi2[i] - dizi2[i + 1];
            c = dizi1[i] - Math.abs(b) + dizi1[i + 1];

            if (c < 0){
                System.out.println(c + dizi1[i]);
            }else{
                System.out.println(c);
            }
        }
    }
}