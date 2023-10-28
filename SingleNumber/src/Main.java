import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin: ");
        a = sc.nextInt();

        int [] dizi = new int[a];

        System.out.print("Elemanları girin: ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        for(int i = 0; i < dizi.length; i++){
            for (int j = 0; i<dizi.length; j++){
                if(dizi[i] != dizi[j]){
                    System.out.print("Dizideki farklı eleman: " + dizi[i]);
                }
                }
            }
        }

}