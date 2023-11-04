import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int low,high,zero,one;
        Scanner sc = new Scanner(System.in);

        System.out.print("low: ");
        low = sc.nextInt();

        System.out.print("high: ");
        high = sc.nextInt();

        System.out.print("zero: ");
        zero = sc.nextInt();

        System.out.print("one: ");
        one = sc.nextInt();

        if(zero == 0 && one == 0){
            System.out.println(false);
        }else if(low == 0){
            System.out.println("Değer sıfır olamaz.");
        }else if(high == 0){
            System.out.println("Değer sıfır olamaz: ");
        }else{
            int t = low + high + zero +one;
            System.out.println(t);
        }

    }
}