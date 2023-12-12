import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,d,f;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin: ");
        a = sc.nextInt();

        System.out.print("İlk indeksi girin: ");
        d = sc.nextInt();

        System.out.print("İkinci indeksi girin: ");
        f = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Elemanları girin: ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        int b = dizi[0];
        int c = dizi[0];

        if(d > a || f > a){
            System.out.println("İndeks dizinin uzunluğunda büyük olamaz");
        }else{

            for(int i = 0; i < a; i++){
                if(b < dizi[i]){
                    b = dizi[i];
                }
            }

            for(int i = 0; i < a; i++){
                if(c > dizi[i]){
                    c = dizi[i];
                }
            }

        }

        int ilkIslem = 0;
        if(d > f){
          ilkIslem = dizi[d] - dizi[f];
        }else{
            ilkIslem = dizi[f] - dizi[d];
        }

        int ikinciIslem = dizi[b]-dizi[c];

        if(ilkIslem < ikinciIslem){
            System.out.println(ikinciIslem);
        }else{
            System.out.println(ilkIslem);
        }



        System.out.println(b);
        System.out.println(c);



    }
}