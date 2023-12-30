import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin: ");
        a = sc.nextInt();

        String[] dizi = new String[a];

        System.out.println("Elemanları girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextLine();
        }

        for(int i = 0; i < a -1; i++){
            if(dizi[i].contains(dizi[i+1])){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }

        System.out.println(Arrays.toString(dizi));
    }
}