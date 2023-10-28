import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a;
        int c, b=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Hedef kelimeyi girin: ");
        a = sc.nextLine();

        System.out.print("Eleman sayısını girin: ");
        c = sc.nextInt();

        String[] dizi = new String[c];

        System.out.print("Kelimeleri girin: ");
        for(int i = 0; i < c ; i++){
            dizi[i] = sc.nextLine();
        }

        for(int j = 0; j < c; j++){

            if (dizi[j].contains(a)){
               b++;
                System.out.println("Eşleşiyor, kelime " + dizi[j]);
            }else{
                System.out.println("Girilen kelimeler hedef kelime ile eşleşmiyor.");
            }
        }
    }
}