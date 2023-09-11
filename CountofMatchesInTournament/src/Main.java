import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.print("Takım Sayısını girin: ");

        int takimSayisi;
        int aTakim;

        Scanner sc = new Scanner(System.in);
        takimSayisi = sc.nextInt();


        if (takimSayisi > 0) {
            if (takimSayisi % 2 == 0) {
                int yeniTakimSayisi = takimSayisi / 2;
                System.out.println("Eşlemeşme Sayısı: " + yeniTakimSayisi);
            } else {
                int islemSonrasiTakim = (takimSayisi - 1) / 2;
                System.out.println("Eşleşme Sayısı: " + islemSonrasiTakim);
            }
        }
        else{
            System.out.println("Turnuvaya katılan takım sayısı en az 2 olmalıdır.");
        }
    }
}


