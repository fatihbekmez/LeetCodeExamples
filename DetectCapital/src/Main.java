import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kelimeyi girin: ");
        a = sc.nextLine();

        if(!a.matches(".*[A-Z].*")) {
            System.out.println("False");
        }else{
            System.out.println("True");
        }
    }
}