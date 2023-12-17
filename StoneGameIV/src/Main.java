import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Taş sayısını girin: ");
        a = sc.nextInt();

        int sayi = Math.abs(a);
        double yeniSayi = Math.sqrt(sayi);


        if(sayi == 1){
            System.out.println(true);
        }else if(sayi == 2){
            System.out.println(false);
        } else if(sayi == 3){
            System.out.println(false);
        }else if(sayi == 4){
            System.out.println(true);
        } else{
            for(int i = 0; i < a;i++){
                if(yeniSayi > 0){
                    if(yeniSayi^yeniSayi == sayi){
                        System.out.println(true);
                    }else{
                        yeniSayi -= yeniSayi;
                    }
                }
            }
        }
    }

}