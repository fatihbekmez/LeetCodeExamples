import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Oda sayısını girin: ");
        a = sc.nextInt();

        int[] oda = new int[a];

        System.out.println("Oda numaralırını girin");
        for(int i = 0; i < a; i++){
            oda[i] = sc.nextInt();
        }


        int b = 0;
        if(oda[0] != 1){
            System.out.println(false);
        }else{
            for(int i = 0; i < a; i++){
                if(oda[i] - oda[i + 1] == 1){
                    b++;
                    if(b == oda.length -1){
                        System.out.println(true);
                    }else{
                        System.out.println(false);
                    }
                }
            }
        }

    }
}