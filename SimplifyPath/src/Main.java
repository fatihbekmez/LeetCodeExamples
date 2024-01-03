import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kelimeyi girin: ");
        a = sc.nextLine();

        int b = a.length()-1;
        String yeniKelime = null;
        String yeniKelime2 = null;

        if(a.charAt(0) != '/'){
            System.out.println(false);

        }

        if(a.charAt(b) == '/'){
            yeniKelime = a.substring(0, b);
        }

        for(int i = 0; i < b; i++){
            if(a.charAt(i) == '/' && a.charAt(i+1) == '/'){
                yeniKelime = a.substring(0,i+1);
                yeniKelime2 = a.substring(i+2,b+1);
                System.out.println(yeniKelime + yeniKelime2);

            }

        }

        if(a.contains("/../")){
            System.out.println("/");
        }

        if(yeniKelime == null){
            System.out.println(yeniKelime2);
        }










    }
}