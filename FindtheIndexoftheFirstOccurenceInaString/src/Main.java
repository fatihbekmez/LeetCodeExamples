import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a;
        String b;

        System.out.print("İlk kelimeyi girin: ");
        a = sc.nextLine();

        System.out.print("İkinci kelimeyi girin: ");
        b= sc.nextLine();

        if(a.contains(b)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}