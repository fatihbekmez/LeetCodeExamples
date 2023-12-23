import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Hareket sayısını girin");
        a = sc.nextInt();


        String[] dizi = new String[a];

        System.out.println("Hareketleri girin");
        for(int i = 0; i<a; i++){
            dizi[i] = sc.nextLine();
        }

        int b = 0;
        int c = 0;

        for(int j =0; j<a;j++){
            switch (dizi[j]){

                case("n"):
                b++;
                break;

                case("N"):
                    b++;
                    break;

                case("s"):
                    b--;
                    break;

                case("S"):
                    b--;
                    break;

                case("e"):
                    c++;
                    break;

                case("E"):
                    c++;
                    break;

                case("w"):
                    c--;
                    break;

                case("W"):
                    c--;
                    break;

            }


        }

        if(b == 0 && c == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
}