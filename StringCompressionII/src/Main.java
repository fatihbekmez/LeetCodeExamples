import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        String b;

        Scanner sc = new Scanner(System.in);

        System.out.print("Kelimeyi girin: ");
        b = sc.nextLine();

        System.out.print("Silinmeye sayısını girin: ");
        a = sc.nextInt();

        char d = (char)a;
        int count = 0;
        char c;

        for(int i = 0; i <= b.length(); i++){
            c = b.charAt(i);
            if(c == b.charAt(i+1)){
                count++;

                if(count == a){
                    b.replace(b.charAt(i), d);
                    System.out.println(b);
                    System.out.println(count);
                }else if( a == 0){
                    System.out.println(0);
                }
            }
        }
        

    }
}