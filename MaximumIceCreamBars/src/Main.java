import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Çocuk sayısını girin: ");
        a = sc.nextInt();

        System.out.print("Maksimum parayı girin: ");
        b = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Çocukların paralarını girin ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }


        int toplam = 0;
        int sayac = 0;

        for(int i = 0; i < a; i++){
            toplam += dizi[i];
            sayac++;
            if(toplam >= b){
                break;
            }
        }

        System.out.println(toplam);
        System.out.println(sayac);


    }
}