import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Su miktarını girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }


        int b = dizi[0];
        int c = dizi[0];

        for(int i = 0; i < a; i++){
            if(dizi[i] > b){
                c = b;
                b = dizi[i];
            }else if(dizi[i] > c){
                c = dizi[i];
            }
        }


        int d = dizi[0];
        for(int j = 0; j < a;j++){
            if(dizi[j] < d){
                d = dizi[j];
            }
        }


        int toplam = 0;

        for(int k = 0; k < a; k++){
            if(dizi[k] > d && dizi[k] <= b ){
                toplam += dizi[k];
            }
        }

        System.out.println(toplam);
    }
}