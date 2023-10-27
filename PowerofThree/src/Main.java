import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayıyı girin: ");
        a = sc.nextInt();

        if(a % 3 == 0){
            System.out.println("True");
        }else if( a == 0){
            System.out.println("False");
        }else{
            System.out.println("Fasle");
        }
    }
}