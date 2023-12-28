import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int total = 0;
        int ftotal = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Çocuk sayısını girin: ");
        a = sc.nextInt();
        int[] dizi = new int[a];


        if(a == 0){
            System.out.println(false);
        }else{
            System.out.println("Şeker sayısını girin");
            for(int i = 0; i < a; i++){
                dizi[i] = sc.nextInt();
            }
        }

        int b = dizi[0];
        for(int j = 0; j < a; j++){
            if(dizi[j] < b){
                b = dizi[j];
            }
        }

        int c = dizi[0];
        for(int j = 0; j < a; j++){
            if(dizi[j] > c){
                c = dizi[j];
            }
        }


        for(int i = 0; i < a-1; i++){
            total++;
            if(dizi[i] == dizi[i+1]){
                if (dizi[i] == c) {
                    ftotal = total + 2;
                }
            }
        }
        for(int j = 0; j < a; j++){
            total++;
            if(dizi[j] == 0){
                total+= 2;
                ftotal = total - 1;
            }
        }

        System.out.println(ftotal);



    }


}