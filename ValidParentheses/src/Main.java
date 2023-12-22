import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kelimeyi girin: ");
        a = sc.nextLine();


        for(int i = 0; i < a.length(); i++){
            if(a.contains("()")){
                System.out.println(true);
            }else if(a.contains("[]")){
                System.out.println(true);
            }else if(a.contains("{}")){
                System.out.println(true);
            }
        }

        if(a.contains("(]") || a.contains("(}")){
            System.out.println(false);
        }else if(a.contains("{]") ||a.contains("{]")){
            System.out.println(false);
        }else if(a.contains("[)") || a.contains("[}")){
            System.out.println(false);
        }
    }
}