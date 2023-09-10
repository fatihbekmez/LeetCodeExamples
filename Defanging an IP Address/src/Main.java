import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String ip;
        String newIP;
        System.out.print("IP Adresini girin: ");
        Scanner sc = new Scanner(System.in);

        ip = sc.nextLine();
        newIP = ip.replace(".","[.]");

        System.out.println("Yeni IP: " + newIP);


    }


}