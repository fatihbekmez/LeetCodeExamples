import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayıyı girin: ");
        a = sc.nextInt();

        if(a>=1){
            if(a/1 == a){
                b = a/1;
                System.out.println(b);
            }else{
                b = -1;
                System.out.println(b);
            }
        }
    }
}