import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, bir, on, yuz, bin, top1 = 0, top2 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayıyı girin: ");
        a = sc.nextInt();

        if (a < 10) {
            System.out.println(a);
        } else if (a >= 10 && a < 100) {

            bir = a % 10;
            on = a / 10;

            top1 = bir + on;

            if (top1 > 10) {

                bir = top1 % 10;
                on = top1 / 10;
                top2 = bir + on;
                System.out.println(top2);
            }

        } else if ( a >= 100 && a < 1000){

            yuz = a / 100;
            on = (a%100) / 10;
            bir = (a%100) % 10;
            top1 = yuz +  on + bir;

            if(top1 > 10){
                bir = top1 % 10;
                on = top1 / 10;
                top2 = bir + on;
                System.out.println(top2);
            }else{
                System.out.println(top1);
            }
        }
    }
}