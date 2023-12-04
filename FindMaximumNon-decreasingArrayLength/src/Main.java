import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin: ");
        a = sc.nextInt();


        int[] dizi = new int[a];

        System.out.println("Elemanları girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }


        int b = dizi[0];
        int count = 0;

        for(int i = 0; i < a-1; i++){
            if(dizi[i] < dizi[i+1]){
                count++;
            }else if(dizi[i] > dizi[i+1]){
                count++;
            }
        }

        System.out.println(count);
    }
}