import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("İlk kelimeyi girin: ");
        a = sc.nextLine();

        System.out.print("İkinci kelimeyi girin: ");
        b = sc.nextLine();

        String c = "*";
        char d = b.charAt(1);
        String e = "?"+d;


        if( a.equals(e) || b.equals(c)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}