import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Kelimeyi girin: ");
        a = sc.nextLine();

        for(int i = 0; i < a.length(); i++){
            if (a.contains("()") ) {
               a.replace("()","o");
            }else if(a.contains("(al)")){
                a.replace("(al)","al");
            }
            System.out.println(a);
        }
    }
}