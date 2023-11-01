import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci versiyonu girin: ");
        a = sc.nextLine();

        System.out.print("İkinci versiyonu girin: ");
        b = sc.nextLine();


        boolean b1 = Double.parseDouble(a) < Double.parseDouble(b);
        boolean b2 = Double.parseDouble(a) > Double.parseDouble(b);

        if(b1){
            System.out.println("-1");
        }else if(b2){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}