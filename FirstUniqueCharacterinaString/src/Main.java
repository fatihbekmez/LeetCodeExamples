import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 0;
        Scanner sc = new Scanner(System.in);

        String[] dizi = new String[1];

        System.out.println("Kelimeyi girin");
        dizi[0] = sc.nextLine();

        for(int i = 0; i < dizi.length; i++){
            if(dizi[i].charAt(i) == dizi[0].charAt(i)){
                a++;
            }
        }

        if(a > 2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}