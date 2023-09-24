import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a,b,c,d;
        Scanner sc = new Scanner(System.in);

        System.out.print("İlk kelime girin: ");
        a = sc.nextLine();

        System.out.print("İkinci kelimeyi girin: ");
        b = sc.nextLine();

        System.out.print("Aranacak kelimeyi girin: ");
        c = sc.nextLine();

        d = a.concat(b);

        System.out.println(c.contains(d));

    }
}