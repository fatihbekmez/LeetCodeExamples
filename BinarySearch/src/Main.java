import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Kaç eleman gireceksiniz ? ");
        a = sc.nextInt();

        System.out.print("Aranacak elemanı girin: ");
        b = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Sayıları girin ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        for (int i = 0; i < a; i++){

            if(dizi[i] != b){
                System.out.println("-1");
            }else if (dizi[i] == b){
                System.out.println(i);
                break;
            }

        }
    }
}