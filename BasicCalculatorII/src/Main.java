import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a;
        Scanner sc = new Scanner(System.in);

        System.out.print("İşlemi girin: ");
        a = sc.nextLine();

        List<Integer> liste = new ArrayList<>();
        int[] dizi = new int[4];

        int b,c,d,e,f,g,h,k;
        int isira = 0;
        int isira2 = 0;
        int isira3 = 0;
        int isira4 = 0;
        int ctoplam = 0;
        int btoplam = 0;
        int ttoplam = 0;
        int citoplam = 0;
        int total = 0;

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == '*'){
                isira = i;
                b = Integer.parseInt(String.valueOf(a.charAt(i-1)));
                c = Integer.parseInt(String.valueOf(a.charAt(i+1)));
                ctoplam = b*c;
                total += ctoplam;
            }

            if(a.charAt(i) == '-'){
                isira2 = i;
                d = Integer.parseInt(String.valueOf(a.charAt(i-1)));
                e = Integer.parseInt(String.valueOf(a.charAt(i+1)));
                citoplam = d - e;
                if(citoplam < 0){
                    Math.abs(citoplam);
                }

                total += citoplam;
            }

            if(a.charAt(i) == '/'){
                isira3 = i;
                f = Integer.parseInt(String.valueOf(a.charAt(i-1)));
                g = Integer.parseInt(String.valueOf(a.charAt(i+1)));
                btoplam = f/g;
                total += btoplam;

            }

            if(a.charAt(i) == '+'){
                isira4 = i;
                h = Integer.parseInt(String.valueOf(a.charAt(i-1)));
                k = Integer.parseInt(String.valueOf(a.charAt(i+1)));
                ttoplam = h+k;
                total += ttoplam;

            }

        }



        System.out.println(total);
    }
}