import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a;
        String b;
        boolean isUe;

        Scanner sc = new Scanner(System.in);

        System.out.print("ilk e maili girin: ");
        a = sc.nextLine();

        System.out.print("İkinci e maili girin: ");
        b = sc.nextLine();

        if(a.equals(a)){
            isUe = false;
            System.out.println(isUe + " Girilen mail adresleri aynı");
        }else{
            isUe = true;
            System.out.println(isUe + " Girilen mail adresleri farklı");
        }

    }
}