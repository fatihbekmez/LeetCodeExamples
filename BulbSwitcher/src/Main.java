import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Adım sayısını girin: ");
        a = sc.nextInt();

        if(a>0) {
            for (int i = 1; i < a; i++) {
                if (i / 2 == 0) {
                    System.out.println("2");
                } else if (i  / 3 == 0){
                    System.out.println("1");
                }else{
                    System.out.println("3");
                }
            }
        }
    }
}