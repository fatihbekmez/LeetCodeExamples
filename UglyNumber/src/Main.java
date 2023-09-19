import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int b = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayıyı girin: ");
        a = sc.nextInt();

        while (b < 3) {

            if (a % 2 == 0){
                b++;
            }
            else if (a % 3 == 0) {
                b++;
            }
            else if (a % 5 == 0){
                b++;
            }
            else{
                break;
            }
        }

        if (b == 3){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}