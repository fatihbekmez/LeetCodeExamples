import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("İlk sayıyı girin: ");
        a = sc.nextInt();

        System.out.println("İkinci Sayıyı girin: ");
        b = sc.nextInt();

        int count = 0;

        if(a == b) {
            System.out.println("1");
        }else if(a > b){
            for (int i = 0 ; i < 10; i++){
                a--;
                b++;
                count++;
                if(a == b){
                    break;
                }

            }
            System.out.println(count);
        }else{
            System.out.println(false);
        }



    }
}