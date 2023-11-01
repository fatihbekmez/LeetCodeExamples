import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a;
        int b = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("İşlemi girin: ");
        a = sc.nextLine();


        b = Integer.parseInt(a);
        System.out.println(b);

    }
}