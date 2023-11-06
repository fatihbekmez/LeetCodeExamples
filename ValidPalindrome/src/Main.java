import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Cümleyi girin: ");
        a = sc.nextLine();

        String b = a.replaceAll("\\s","");

        for (int i = 0; i < b.length() / 2; i++){
            if(b.charAt(i) != b.charAt(b.length() - 1 - i)){
                System.out.println(false);
                break;
            }else{
                System.out.println(true);
                break;
            }
        }
    }
}