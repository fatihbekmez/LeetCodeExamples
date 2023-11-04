import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a, b;
        int c = 0,d = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("İlk kelimeyi girin: ");
        a = sc.nextLine();

        System.out.print("İkinci kelimeyi girin: ");
        b = sc.nextLine();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                c++;
            }
        }

        if(c == b.length()){
            System.out.println("0");
        }else{
            d = c - b.length();
            System.out.println(d);
        }

    }

}