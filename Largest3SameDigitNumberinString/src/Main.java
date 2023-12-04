import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a,c;
        int b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin: ");
        b = sc.nextInt();

        String[] dizi = new String[b];

        System.out.print("Elemanları girin: ");
        for(int i = 0; i < b; i++){
            dizi[i] = sc.nextLine();
        }

        a = dizi[0];
        int count = 0;

        for(int i = 0; i < b; i++){
            if(a == dizi[i] && a == dizi[i+1] && a == dizi[i + 2]){
                c = dizi[i] + dizi[i +1] + dizi[i + 2];

                    System.out.println(c);
                    break;
            }

        }



    }
}