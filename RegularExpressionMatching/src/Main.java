import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("İlk kelimeyi girin: ");
        a = sc.nextLine();

        System.out.print("İkinci kelimeyi girin: ");
        b = sc.nextLine();

        char c = a.charAt(0);
        String d = c+"*";

        if( b.equals(d)){
            System.out.println(true);
        }else if(b.equals(".*")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}