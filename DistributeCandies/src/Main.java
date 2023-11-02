import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Şeker tip sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Şeker sayılarını girin: ");
        for (int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        if(a%2 == 0){
            b = a / 2;
        }
        else if(a / 2 == 1){
            b = (a - 1) / 2;
        }

        System.out.println("Yiyebileceği şeker sayısı: " + b);
    }
}