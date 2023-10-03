import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a;
        int uzun;
        char firstc;
        Scanner sc = new Scanner(System.in);

        System.out.print("IP Adresini girin: ");
        a = sc.nextLine();
        firstc = a.charAt(0);

        uzun = a.length();
        if(uzun == 12){
            if(firstc >= 1 || firstc <= 255){
                System.out.println("IPv4");
            }else{
                System.out.println("False");
            }
        }
        else if (uzun == 32){
            if(firstc >= 1 || firstc <= 4){
                System.out.println("IPv6");
            }else{
                System.out.println("False");
            }
        }
        else{
            System.out.println("False");
        }
    }
}