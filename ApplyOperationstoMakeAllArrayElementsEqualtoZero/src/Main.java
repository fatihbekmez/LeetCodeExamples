import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c=0,d=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç eleman gireceksiniz: ");
        a = sc.nextInt();

        System.out.print("Değişim sayısını girin: ");
        b = sc.nextInt();


        for(int i = 0; i < 100; i++){
            if(b > a){
                System.out.println("Değişim sayısı dizi boyutundan büyüktür.");
                System.out.print("Değişim sayısını girin: ");
                b = sc.nextInt();
            }
        }

        int[] dizi = new int[a];

        System.out.println("Elemanları girin");


        for(int i =0; i < a; i++){
            dizi[i] = sc.nextInt();
        }


        for(int i=0; i < a; i++){
            dizi[i] = dizi[i] - 1;
            if(dizi[i] == 0){
                c++;
            }
            else{
                d++;
            }
        }

        if(d > 0){
            System.out.println(false);
        }else{
            System.out.println(true);
        }

    }
}