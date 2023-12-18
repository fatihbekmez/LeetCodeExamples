import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 0;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        int[] dizi = new int[a];

        System.out.println("Elemanları girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        int b = dizi[0];
        int c = 0;
        int count = 0;


        if(a < 4){
            System.out.println(false);
        }else if(a >= 4){
            for(int i = 0; i<a;i++){
                if(dizi[i] == b){
                    count++;
                    if(count >= 3){
                        for(int sayi : dizi){
                            c ^= sayi;
                        }
                        System.out.println(dizi[i]);
                        System.out.println(c);
                    }else{
                        System.out.println("Tekrar eden sayı bulunmadı.");
                    }
                }
            }


        }

        //System.out.println(count);
    }
}