import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a,b,c = null;


        Scanner sc = new Scanner(System.in);

        System.out.print("ilk kelimeyi girin: ");
        a = sc.nextLine();

        System.out.print("ikinci kelimeyi girin: ");
        b = sc.nextLine();

        if(a.length() > b.length()){
            for(int i = 0; i < b.length(); i++){
                c = String.valueOf(a.charAt(i) + b.charAt(i + 1));
            }
        }else{
            for(int i = 0; i < b.length(); i++){
                c = String.valueOf(a.charAt(i) + b.charAt(i + 1));
            }
        }
        System.out.println(c);
    }
}