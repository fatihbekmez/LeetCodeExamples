import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String book;
        int a,start,end;




        Scanner sc = new Scanner(System.in);

        System.out.print("Kitap sayısını girin: ");
        a = sc.nextInt();


        int[] dizi = new int[a];
        List<MyCalender> kitaplar = new ArrayList<>();

        int gecenSure = 0;

        for(int i = 0; i < a; i++){

            System.out.println("Kitap adını girin: ");
            book = sc.nextLine();

            System.out.println("                       ");

            System.out.println("Başlangıç zamanını girin: ");
            start = sc.nextInt();

            System.out.println("Bitiş zamanını girin: ");
            end = sc.nextInt();

            if(start > end){
                System.out.println("Bitiş başlangıçtan büyük olamaz");
                return;
            }else{
                gecenSure = end - start;
            }

            dizi[i] = end;

            kitaplar.add(new MyCalender(book,start,end));
        }

        for (int j = 0; j < dizi.length; j++){
            if(dizi[j] > dizi[j+1]){
                System.out.println(false);
            }else{
                System.out.println(true);
            }
        }


        System.out.println("Kitaplar");
        for(MyCalender myCalender : kitaplar){
            System.out.println(myCalender);
        }



    }

}