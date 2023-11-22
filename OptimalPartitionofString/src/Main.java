import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kelimeyi girin: ");
        a = sc.nextLine();

        char b;
        int count = 0;

        for(int i = 0; i < a.length(); i++){
            b = a.charAt(i);
            count = 1;
            
            for (int j = i +1; j < a.length(); j++){
                if (a.charAt(j) == b){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}