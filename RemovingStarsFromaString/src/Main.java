import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);


        String[] dizi = new String[1];

        System.out.print("Kelimeyi girin: ");
        dizi[0] = sc.nextLine();



        if(dizi[0].contains("*")){
            char harfkaldir = '*';
            dizi[0] = dizi[0].replace(String.valueOf(harfkaldir),"");
        }

        System.out.println(dizi[0]);
    }
}