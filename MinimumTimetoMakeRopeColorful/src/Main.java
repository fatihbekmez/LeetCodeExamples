import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        String b;
        Scanner sc = new Scanner(System.in);


        System.out.print("Renkleri girin: ");
        b = sc.nextLine();

        int[] dizi = new int[b.length()];

        System.out.println("Zamanları girin");
        for(int i = 0; i < b.length(); i++){
            dizi[i] = sc.nextInt();
        }

        char c = b.charAt(0);

        int count = 0;

        for(int i = 0; i < b.length(); i++){
            if(c == b.charAt(i)){
                count++;
            }else{
                System.out.println("0");;
            }
        }
        if(c > 0){
            System.out.println(dizi[count -1]);
        }

    }
}