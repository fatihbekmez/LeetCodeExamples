import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a;
        int b;
        Scanner sc = new Scanner(System.in);


        System.out.print("Kelimeyi girin: ");
        a = sc.nextLine();

        System.out.print("Değişim sayısını girin: ");
        b = sc.nextInt();

        char ilk = a.charAt(0);
        char son = a.charAt(a.length() -1);

        for(int i = 0; i < a.length(); i++){
            a.charAt[0] = a.charAt(a.length() - 1);
        }

        c = a.replace(son,ilk);
        System.out.println(c);


    }
}