import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Merdiven sayısını girin: ");
        a = sc.nextInt();

        if(a / 2 == 0){
            c = a / 2;
            System.out.println("Adım sayısı: " + c);
        }else{
            c = a / 1;
            System.out.println("Adım sayısı: " + c);
        }
    }
}