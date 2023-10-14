import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Notu girin: ");
        a = sc.nextLine();

        System.out.print("Aranacak değeri girin: ");
        b = sc.nextLine();

        if (a.contains(b)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}