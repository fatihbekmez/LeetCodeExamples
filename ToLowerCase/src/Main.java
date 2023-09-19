import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a;
        String b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kelimeyi girin: ");
        a = sc.nextLine();

        if (a == ""){
            System.out.println("Kelime girmediniz.");
        }
        else{
            b = a.toLowerCase();
            System.out.println(b);
        }
    }
}