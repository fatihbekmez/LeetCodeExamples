import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int day;
        String month;
        int year;
        int newMonth = 0;

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Günü Giriniz: ");
        day = sc.nextInt();

        System.out.print("Ayı giriniz: ");
        month = sc1.nextLine();

        System.out.print("Yılı giriniz: ");
        year = sc2.nextInt();

        switch (month) {

            case "Ocak":
                newMonth = 1;
                break;

            case "Şubat":
                newMonth = 2;
                break;

            case "Mart":
                newMonth = 3;
                break;

            case "Nisan":
                newMonth = 4;
                break;

            case "Mayıs":
                newMonth = 5;
                break;

            case "Haziran":
                newMonth = 6;
                break;

            case "Temmuz":
                newMonth = 7;
                break;

            case "Ağustos":
                newMonth = 8;
                break;

            case "Eylül":
                newMonth = 9;
                break;

            case "Ekim":
                newMonth = 10;
                break;

            case "Kasım":
                newMonth = 11;
                break;

            case "Aralık":
                newMonth = 12;
                break;

                
        }

        System.out.println(year + "-" + newMonth + "-" + day);
    }
}