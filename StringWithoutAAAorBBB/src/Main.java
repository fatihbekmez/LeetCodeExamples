import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("A sayısını girin: ");
        a = sc.nextInt();

        System.out.print("B sayısını girin: ");
        b = sc.nextInt();

        if (a > 0 && b > 0){
            for (int i = 0; i < a; i++){
                System.out.print("A");
            }

            for (int i = 0; i < b; i++){
                System.out.print("B");
            }
        }
    }
}