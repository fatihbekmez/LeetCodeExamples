import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Gün sayısını girin: ");
        a = sc.nextInt();

        int toplam = 0;
        int toplam2 = 0;
        int total = 0;
        int bolum = 0;

        if(a <= 7){
            for(int i = 1; i <= a; i++){
                toplam += i;
            }
            System.out.println(toplam);
        }else if(a >= 8){
            bolum = a/7;
            toplam2 = bolum * 28;
            int artiGun = a % 7;
            for(int i = 0; i <= artiGun; i++){
                toplam += i;
            }

            total = toplam2 + toplam;
            System.out.println(total);
        }


    }
}