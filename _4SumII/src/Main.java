import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b = 0, c = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Diziye girilecek eleman sayını yazın: ");
        a = sc.nextInt();
        int[] dizi = new int [a];
        int[] dizi2 = new int [a];
        int[] dizi3 = new int [a];
        int[] dizi4 = new int [a];

        System.out.println("Birinci dizi için elemanları girin: ");
        for (int i = 0; i<a; i++){
            dizi[i] =  sc.nextInt();
        }

        System.out.println("İkinci dizi için elemanları girin: ");
        for (int i = 0; i<a; i++){
            dizi2[i] =  sc.nextInt();
        }

        System.out.println("Üçüncü dizi için elemanları girin: ");
        for (int i = 0; i<a; i++){
            dizi3[i] =  sc.nextInt();
        }

        System.out.println("Dördüncü dizi için elemanları girin: ");
        for (int i = 0; i<a; i++){
            dizi4[i] =  sc.nextInt();
        }

        if( a == 1) {
            b = dizi[0] + dizi2[0] + dizi3[0] + dizi4[0];
        } else{
        b = dizi[0] + dizi2[0] + dizi3[0] + dizi4[1];
        c = dizi[1] + dizi2[1] + dizi3[1] + dizi4[0];
        }



        if(b == 0){
            System.out.println("1");
        }else if(c == 0){
            System.out.println("1");
        }else if(b == 0 && c == 0){
            System.out.println("2");
        }else{
            System.out.println(false);
        }

    }
}