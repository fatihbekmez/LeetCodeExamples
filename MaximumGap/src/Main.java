import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Elemanları sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Elemanları girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        int b = dizi[0];
        int c = dizi[0];
        int d = dizi[0];
        int e = dizi[0];

        if(a <= 2){
            System.out.println(false);
        }else{

            for(int j = 0; j < a; j++){
                if (b < dizi[j]) {
                    c = b;
                    b = dizi[j];
                }
                else if(dizi[j] > c){
                    c = dizi[j];
                }
            }

            for(int i = 0; i < a; i++){
                if(dizi[i] > b){
                    b = dizi[i];
                }
            }

            for(int i = 0; i < a; i++){
                if(dizi[i] < c){
                    e = d;
                    e = dizi[i];
                }else if(dizi[i] < e){
                    e = dizi[i];
                }
            }

            for(int k = 0; k < a; k++){
                if(dizi[k] < d ){
                    d = dizi[k];
                }
            }

        }


        int fark = 0;
        int fark1 = 0;

        fark  = b - c;
        fark1 = e - d;

        if(fark > fark1){
            System.out.println(fark);
        }else{
            System.out.println(fark1);
        }


    }

}