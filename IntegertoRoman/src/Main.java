import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayıyı girin: ");
        a = sc.nextInt();

        String b = "I";
        String c = "II";
        String d = "III";




        int c1 = 0;
        int c2 = 0;
        int c3 = 0;

        if(a <= 5){
            switch (a){
                case 1:

                    System.out.println(b);
                    break;

                case 2:

                    System.out.println(c);
                    break;

                case 3:

                    System.out.println(d);
                    break;

                case 4:
                    System.out.println("IV");
                    break;

                case 5:
                    System.out.println("V");
                    break;
            }

        }else if (a >= 6  && a <= 8){
            System.out.print("V");
            for(int i = 0; i < a - 5; i++){
                System.out.print(b);
            }
        }else if(a == 10){
            System.out.println("X");
        }else if(a == 15){
            System.out.println("VX");
        }else if (a >= 9 && a <= 13){
            for(int i = 0; i < a - 8; i++){
                System.out.print(b);
            }
            System.out.print("X");
        }else if( a >= 14 && a <= 18){
            for(int i = 0; i < a - 13; i++){
                System.out.print(b);
            }
            System.out.print("XX");
        }else if( a >= 20) {
            int bol1 = 0;
            for (int i = 0; i < a; i++) {
                bol1 = a / 5;
                if (bol1 < 5) {
                    c1++;
                }
            }

            int bol2 = 0;
            for (int i = 0; i < a; i++) {
                bol2 = a / 10;
                if (bol2 < 10) {
                    c2++;
                }
            }
            int bol3 = a % 10;
            c3++;

            if (bol1 > 0) {
                for (int i = 0; i < c1; i++) {
                    System.out.print("V");
                }
            }
            if (bol2 > 0) {
                for (int i = 0; i < c2; i++) {
                    System.out.print("X");
                }
            }
            if (bol3 > 0) {
                for (int i = 0; i < c3; i++) {
                    System.out.print(b);
                }
            }
        }
    }
}