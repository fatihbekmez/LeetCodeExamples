import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Elemanları girin");
        for(int i=0; i < a;i++){
            dizi[i] = sc.nextInt();
        }

        int b = dizi[0];
        int c = 0;

        for(int i = 0; i < a; i++){
            if(dizi[i] == b){
                c++;
            }
        }

        if(c > 2){
            c = c*2;
        }

        System.out.println(c);
    }
}