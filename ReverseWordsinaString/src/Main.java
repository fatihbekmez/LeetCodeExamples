import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a,b = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Kelimeyi girin: ");
        a = sc.nextLine();

        String[] dizi = a.split("");

        for(int i = a.length() -1; i >= 0; i--){
            b += dizi[i];
        }

        System.out.println(b);
    }
}