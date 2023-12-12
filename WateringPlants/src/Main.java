import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);


        System.out.print("Çiçek sayısını girin: ");
        a = sc.nextInt();

        System.out.print("Tank kapasitesini girin: ");
        b = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Su ihtiyaçlarını girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        int c = dizi[0];
        for(int i = 0; i < a; i++){
            if(c < dizi[i]){
                c = dizi[i];
            }
        }

        if(c > b){
            System.out.println("Tank kapasitesi çiçeklerin ihtiyacından fazla");
        }


        int count = 0;
        for(int i = 0; i < a-1; i++){
            if(dizi[i] - b != 0 && b < dizi[i + 1]){
                count++;
            }else if (dizi[i] - b < 0){
                break;
            }
        }

        if(count > 0){
            b += count*b;
        }

        System.out.println("Harcanan su: " + " " +b);
    }
}