import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a;
        int b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayıyı girin: ");
        a = sc.nextLine();

        System.out.print("Kontrol sayısını girin: ");
        b = sc.nextInt();

        int count = 0;
        int g = Integer.parseInt(a);
        String c = null;
        String d = null;
        String h = null;


        if(a.length() == 3){
                    c = a.substring(0,2);
                    d = a.substring(1,3);


                    int e = Integer.parseInt(c);
                    int f = Integer.parseInt(d);
                    if(g % e == 0){
                        count++;
                    }

                    if(g % f == 0){
                        count++;
                    }

        }


        for(int i = 0; i < a.length(); i++){
            h = a.substring(i,2);

            int j = Integer.parseInt(h);

            if(g%j == 0){
                count++;
            }

        }


        System.out.println(count);



    }
}