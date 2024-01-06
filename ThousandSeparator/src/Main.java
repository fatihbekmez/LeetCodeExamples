import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        String b,c;
        char d = '.';
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayıyı girin: ");
        a = sc.nextInt();

        if(a < 999){
            b = Integer.toString(a);
            System.out.println(b);
        }else if(a >= 1000 && a < 9999){

            b = Integer.toString(a);
            StringBuilder sb = new StringBuilder(b);
            sb.setCharAt(1,d);

            c = sb.toString();

            System.out.println(c);
        }else if(a >= 10000 && a < 100000){

            b = Integer.toString(a);
            StringBuilder sb = new StringBuilder(b);
            sb.setCharAt(2,d);

            c = sb.toString();

            System.out.println(c);
        }else if(a >= 100000 && a < 1000000){

            b = Integer.toString(a);
            StringBuilder sb = new StringBuilder(b);
            sb.setCharAt(3,d);

            c = sb.toString();

            System.out.println(c);
        }
    }
}