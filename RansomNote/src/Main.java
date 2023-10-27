import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a,b;
        boolean isTrue;
        Scanner sc = new Scanner(System.in);

        System.out.print("İlk kelimeyi girin: ");
        a = sc.nextLine();

        System.out.print("İkinci kelimeyi girin: ");
        b = sc.nextLine();

        if(b.contains(a)){
            isTrue = true;
            System.out.println(isTrue);
        }else{
            isTrue = false;
            System.out.println(isTrue);
        }
    }
}