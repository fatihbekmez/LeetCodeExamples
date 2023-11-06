import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("İlk kelimeyi girin: ");
        a = sc.nextLine();

        System.out.print("İkinci kelimeyi girin: ");
        b = sc.nextLine();

        if(a.length() != b.length()){
            System.out.println(false);
        }

        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}