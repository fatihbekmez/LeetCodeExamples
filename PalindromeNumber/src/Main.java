import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a,b = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayıyı girin: ");
        a = sc.nextLine();

        for(int i = (a.length()-1); i >=0;){
            b += a.charAt(i);
        }

        if(b.equals(a)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}