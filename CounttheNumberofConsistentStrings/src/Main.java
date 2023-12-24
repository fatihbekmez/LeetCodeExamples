import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        String b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin: ");
        a = sc.nextInt();

        System.out.print("İzin verilen kelimeyi girin: ");
        b = sc.nextLine();


        String[] dizi = new String[a];
        System.out.println("Kelimeleri girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextLine();
        }


        int c = 0;

        for(int i = 0; i < a; i++){
            if(dizi[i].contains(b)){
                c++;
            }else{
                return;
            }
        }

        System.out.println(c);
    }
}