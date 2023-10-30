import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a,b = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kelimeyi girin: ");
        a = sc.nextLine();

        if(a.length() == 2){
            if(a.charAt(0) == a.charAt(1)){
                System.out.println(false);
            }else{
                System.out.println(true);
            }
        }else if (a.length() == 3){
            if((a.charAt(0) == a.charAt(1))&&(a.charAt(1) == a.charAt(2))){
                System.out.println(false);
            }else{
                System.out.println(true);
            }
        }else if (a.length() >= 4){
            for (int i = 1; i < a.length(); i++ ){
                if(a.charAt(i) == a.charAt(i+1)){
                    System.out.println(false);
                }else{
                    System.out.println(true);
                }
            }

        }
    }
}