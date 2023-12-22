import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Toprak sayısını girin: ");
        a = sc.nextInt();

        System.out.print("Kontrol sayısını girin: ");
        b = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Çiçek miktarını girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }


        if(b > a){
            System.out.println(false);
        }else if(b < a){
            if(dizi[b] == 1){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }


        for(int i = 0; i < a; i++){
            if((dizi[b + 1] != 1) && (dizi[b - 1] != 1)){
                System.out.println(true);
            }else{

                System.out.println(false);
            }
        }

    }
}