import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Mermer sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Ağırlıkları girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        int b = 0;
        int c = 0;

        if(dizi.length <= 2){
            System.out.println("0");
        }else if(dizi.length > 3 && dizi.length <= 8){
            for(int i = 0; i < a / 2; i++){
                b += dizi[i];
            }

            for(int j = a / 2; j < a; j++){
                c += dizi[j];
            }
        }

        int son = 0;
        if(b > c){
            son = b - c;
        }else{
            son = c - b;
        }


        System.out.println(b);
        System.out.println(c);
        System.out.println(son);
    }
}