import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nufüsu girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Atıfları girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        int b = dizi[0];
        int total = 0;
        int sonuc = 0;

        for(int i = 0; i < a; i++){
            if(a == 3){
                Arrays.sort(dizi);
                if (dizi[i] == 0) {
                    for(int j = 0; j < 3; j++){
                        if(b < dizi[j]){
                            b = dizi[j];
                        }
                    }

                    System.out.println(dizi[1]);
                }
            }else{
                if(dizi[i] == 0){
                    total += dizi[i];
                    sonuc = total / dizi.length-1;
                }else{
                    total += dizi[i];
                    sonuc = total / dizi.length;
                }
            }
        }

        System.out.println(sonuc);
    }
}