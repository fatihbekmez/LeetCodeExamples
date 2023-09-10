import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Toplama Operatörleri: ++X, X++");
        System.out.println("Çıkarma Operatörleri: --X, X--");

        String opt;
        int a;
        int b;
        int i;
        int j;
        int toplamaSayisi = 0;
        int cikarmaSayisi = 0;
        int y = 0;
        int x = 0;


        System.out.print("Operatör girin: ");
        Scanner sc = new Scanner(System.in);
        opt = sc.nextLine();


        if (opt.equals("X++") || opt.equals("++X")) {
            String topOptSayi[] = opt.split(" ");
            toplamaSayisi = topOptSayi.length;
        } else if (opt.equals("X--,") || opt.equals("--X,")) {
            String cikOptSayi[] = opt.split(" ");
            cikarmaSayisi = cikOptSayi.length;
        }


        for (i = 0; i <= toplamaSayisi; i++) {
            x = (i = i++);
        }

        for (j = 0; j <= cikarmaSayisi; j++) {
            y = (j = j++);
        }

        System.out.println(x + y);
    }
}