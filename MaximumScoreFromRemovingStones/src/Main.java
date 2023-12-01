import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.print("ilk taşı girin: ");
        a = sc.nextInt();

        System.out.print("ikinci taşı girin: ");
        b = sc.nextInt();

        System.out.print("Üçüncü taşı girin: ");
        c = sc.nextInt();

        int d = 0;
        int count = 0;

        if(a > b && a > c){
            d = a;
        }else if(b > a && b > c){
            d = b;
        }else if(c > a && c > b){
            d = c;
        }


        for(int i = 0; i < d; i++){
            for(int j = 0; j < d; j++){
                a--;
                b--;
                count++;
                if(a == 0 || b == 0){
                    break;
                }
            }

            for(int k = 0; k < d; k++){
                b--;
                c--;
                count++;
                if(b == 0 || c == 0){
                    break;
                }
            }
        }

        System.out.println(count);


    }
}