import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;
        int carp = 1;

        System.out.print("Sayıyı girin: ");
        a = sc.nextInt();

        System.out.print("Derece girin: ");
        b = sc.nextInt();

        for (int i = 1; i <= b; i++){
            carp = a * carp;
        }

        System.out.println(carp);
    }
}