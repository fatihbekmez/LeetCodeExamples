import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a,b,tops;
        int c,d,top;
        Scanner sc = new Scanner(System.in);

        System.out.print("İlk ifadeyi girin: ");
        a = sc.nextLine();

        System.out.print("İkinci ifadeyi girin: ");
        b = sc.nextLine();

        c = Integer.parseInt(a);
        d = Integer.parseInt(b);

        top = c + d;
        tops = Integer.toString(top);

        System.out.println(tops);
    }
}