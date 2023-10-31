import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Birinci kelimeyi girin: ");
        a = sc.nextLine();

        System.out.println("İkinci kelimeyi girin: ");
        b = sc.nextLine();

        for(int i = 0; i < a.length(); i++){
         if (a.charAt(i) == b.charAt(i+1)){
            System.out.println(true);
          }else{
               System.out.println(false);
           }
        }

    }
}