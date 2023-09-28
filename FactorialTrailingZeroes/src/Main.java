import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int fac = 1;
        boolean isZero;
        Scanner sc = new Scanner(System.in);

        System.out.print("Faktöriyel hesaplanması istediğiniz sayıyı girin: ");
        a = sc.nextInt();

        for (int i = 1; i <= a; i++){
            fac = fac * i;
        }

        if (fac % 10 == 0 || a == 0){
            isZero = true;
            System.out.println(isZero);
            System.out.println("Faktöriyel: " + fac);
        }else{
            isZero =false;
            System.out.println(isZero);
            System.out.println("Faktöriyel: " + fac);
        }

    }
}