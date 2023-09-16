import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi;
        double kkok;
        boolean isCheck;

        Scanner sc = new Scanner(System.in);

        System.out.print("Sayıyı girin: ");
        sayi = sc.nextInt();

        kkok = Math.sqrt(sayi);

        if(kkok % 1 == 0){
            isCheck = true;
            System.out.print(isCheck);
        }else{
            isCheck = false;
            System.out.println(isCheck);
        }
    }
}