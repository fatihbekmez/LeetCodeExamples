import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a;


        Scanner sc = new Scanner(System.in);

        System.out.println("Kelimeyi girin: ");
        a = sc.nextLine();

        char b = a.charAt(0);


        if(b == '0'){
            System.out.println(false);
        }else{
            if(a.contains("11")){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
    }
}