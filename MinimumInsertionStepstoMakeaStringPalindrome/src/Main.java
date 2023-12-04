import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kelimeyi girin: ");
        a = sc.nextLine();

        int count = 0;

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == a.charAt(a.length()-1)){
                count++;
            }
        }

        int newCount = count / 2;
        int palidnum = 0;

        if(newCount == a.length() / 2){
            System.out.println(false);
        }else{
            palidnum = a.length() - newCount - 1;
        }


        System.out.println(palidnum);
    }
}