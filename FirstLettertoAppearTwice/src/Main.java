import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int b = 0;
        String a;
        char c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kelimeyi girin: ");
        a = sc.nextLine();

        c = a.charAt(0);

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == a.charAt(i+1)){
                b++;
                System.out.println(a.charAt(i));
                break;
            }else{
                System.out.println(false);
            }
        }


        System.out.println(b-1 + " . indeks");

    }
}