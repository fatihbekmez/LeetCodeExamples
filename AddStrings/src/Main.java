import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1;
        String s2;

        System.out.print("Birinci sayıyı girin: ");
        s1 = sc.nextLine();

        System.out.print("İkinci sayıyı girin: ");
        s2 = sc.nextLine();

        int yeni1 = Integer.parseInt(s1);
        int yeni2 = Integer.parseInt(s2);

        System.out.println(yeni1 + yeni2);

    }
}