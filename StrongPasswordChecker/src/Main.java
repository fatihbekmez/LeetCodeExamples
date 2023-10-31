import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int girisHakki = 10, kontrol = 0;
        String a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Parola girin: ");
        a = sc.nextLine();

        for(int i = 0; i<girisHakki; i++) {

            if (a.length() < 6) {
                System.out.println("Girilen parola 6 karakter uzun olmalıdır.");
                System.out.print("Parola girin: ");
                a = sc.nextLine();
            } else if (a.length() > 20) {
                System.out.println("Girilen parola 20 karakterden uzun olamaz");
                System.out.print("Parola girin: ");
                a = sc.nextLine();
            } else {
                kontrol++;
            }

            if(!a.contains(".")&&!a.contains("?")&&!a.contains("!")&&!a.contains("!")){
                System.out.println("Girilen parola özel karakter (*,!,?,. içermelidir.");
                System.out.print("Parola girin: ");
                a = sc.nextLine();
            }else{
                kontrol++;
            }

            if(!a.matches(".*[0-9].*")){
                System.out.println("Girilen parola en az bir rakam içermelidir.");
                System.out.print("Parola girin: ");
                a = sc.nextLine();
            }else{
                kontrol++;
            }


            if(!a.matches(".*[A-Z].*")){
                System.out.println("Girilen parola en az bir büyük harf içermelidir.");
                System.out.print("Parola girin: ");
                a = sc.nextLine();
            }else{
                kontrol++;
            }

            if(!a.matches(".*[a-z].*")){
                System.out.println("Girilen parola en az bir küçük harf içermelidir.");
                System.out.print("Parola girin: ");
                a = sc.nextLine();
            }else{
                kontrol++;
            }

            if(girisHakki == 10){
                System.out.println("Giriş hakkı sayınız dolmuştur.");
                break;
            }
        }


        System.out.println(kontrol);
        System.out.println("Parola tüm kriterleri sağlıyor.");
    }
}