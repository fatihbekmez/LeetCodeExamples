import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Başlangıç değerini girin: ");
        a = sc.nextInt();

        System.out.print("Hedefi girin: ");
        b = sc.nextInt();


        int sonuc;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;

        if(a > b){
            while ( a >= b){
                a--;
                c1++;
            }

            while ( b >= a){
                b *= 2;
                c2++;
            }
        }

        if(b > a){
            while ( b >= a){
                b--;
                c3++;
            }

            while ( a >= b){
                a *= 2;
                c4++;
            }
        }

        if((c1 > c2) && (c1 > c3) && (c1 > c4)){
            System.out.println(c1);
        } else if ((c2 > c1) && (c2 > c3) && (c2 > c4)) {
            System.out.println(c2);
        }else if ((c3 > c1) && (c3 > c2) && (c3 > c4)) {
        System.out.println(c3);
        }else{
            System.out.println(c4);
        }
        

    }
}