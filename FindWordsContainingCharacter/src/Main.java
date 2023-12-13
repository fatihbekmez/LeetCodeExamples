import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        String b;
        char c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Kelime sayısını girin");
        a = sc.nextInt();

        System.out.print("Aranacak harfi girin: ");
        c = sc.next().charAt(0);


        String[] dizi = new String[a];
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextLine();
        }


        int d = 0;

        for(int i = 0; i < a; i++){
            if(dizi[i].charAt(i) == c){
                System.out.println(d);
            }
            else{
                System.out.println("bulunamadı");
            }
        }


    }
}