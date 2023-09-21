import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c,yeniDizi;
        Scanner sc = new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");
        a = sc.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        b = sc.nextInt();

        System.out.print("Üçüncü sayıyı girin: ");
        c = sc.nextInt();

        int[] dizi = new int[3];

        dizi[0] = a;
        dizi[1] = b;
        dizi[2] = c;

        yeniDizi = dizi[0];
        dizi[0] = dizi[2];
        dizi[1] = dizi[1];
        dizi[2] = yeniDizi;

        for (int i = 0; i < dizi.length; i++){
            System.out.print("[" + dizi[i] + "]");
        }

    }
}