import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char giris;
        char harf = 'a';
        int deger = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("harf girin: ");
        giris = sc.next().charAt(1);


        while ( harf <= 'z'){
            harf++;
            deger++;
            if (giris == harf){
                System.out.println(deger);
            }
        }
    }
}