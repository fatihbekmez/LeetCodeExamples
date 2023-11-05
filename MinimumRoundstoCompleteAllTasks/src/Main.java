import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Görev sayısını girin: ");
        a = sc.nextInt();

        int[] dizi = new int[a];

        System.out.println("Görev zorluklarını girin: ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }


        int say2 = 0;
        for(int i = 0; i <a; i++){
            if(dizi[i] == 2){
                say2++;
            }
        }

        int say3 = 0;
        for(int i = 0; i < a; i++){
            if(dizi[i] == 3){
                say3++;
            }
        }

        int say4 = 0;
        for(int i = 0; i < a; i++){
            if(dizi[i] == 4){
                say4++;
            }
        }

        int gun = 0;
        if(say2 == 2){
            gun++;
        }else if(say2 > 2){
            gun = say2 / 2;
        }

        if(say3 <= 2){
            gun++;
        }else if(say3 > 3){
            gun = say3 / 2;
        }

        if(say4 <= 2){
            gun++;
        }else if(say4 > 3){
            gun = say4 / 2;
        }

        System.out.println(gun);
    }
}