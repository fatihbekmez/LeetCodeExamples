import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int s1;
        int s2;
        int s3;
        int carpim;
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        s1 = sc.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        s2 = sc.nextInt();

        System.out.print("Üçüncü sayıyı girin: ");
        s3 = sc.nextInt();

        carpim = s1 * s2 * s3;
        System.out.println(carpim);
    }
}