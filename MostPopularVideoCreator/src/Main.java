import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Yapımcı ve video sayısını girin: ");
        a = sc.nextInt();

        String[] yapim = new String[a];
        String[] video = new String[a];
        int[] puan = new int[a];

        System.out.println("Yapımcıları girin");
        for(int j =0; j < a;j++){
            yapim[j] = sc.nextLine();
        }


        System.out.println("Videoları girin ");
        for(int i = 0; i < a; i++){
            video[i] = sc.nextLine();
        }

        System.out.println("Puanları girin ");
        for(int i = 0; i < a; i++){
            puan[i] = sc.nextInt();
        }

        int b = puan[0];
        int c = 0;

        for(int i = 0; i < a; i++){
            if(puan[i] > b){
                c++;
                b = puan[i];
            }
        }

        String[] total = new String[1];
        for(int i = 0; i < 1; i++){
            total[i] = video[i] + " " + yapim[i] + " " + puan[i];
        }


        System.out.println(Arrays.toString(total));
        System.out.println(b);
        System.out.println(c);

    }
}