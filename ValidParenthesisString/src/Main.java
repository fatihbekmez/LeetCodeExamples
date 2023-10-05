import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a, b, c, d;
        Scanner sc = new Scanner(System.in);

        System.out.print("Karakteri girin: ");
        a = sc.nextLine();

        b = "()";
        c = "(*)";
        d = "(*))";


        if (a.contains(b) || a.contains(c) || a.contains(d)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}

