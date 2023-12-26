import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Zar sayısını girin: ");
        a = sc.nextInt();

        System.out.print("Yüz sayısını girin: ");
        b = sc.nextInt();

        System.out.print("Hedefi girin: ");
        c = sc.nextInt();

        int d = (10^9)+7;

        int toplam = 0;
        int sayac = 0;

        int[] dizi = new int[c];


        if(a == 1){
            if((b >= 1  && b <= 30) && ( c <= b)){
                System.out.println("1");
            }else{
                System.out.println(false);
            }
        }else if(a > 1 && a <= 10){
            switch (a){
                case 2:
                    if(c > (b*2)){
                        System.out.println(false);
                    }else if (c <= b){
                        System.out.println("1");
                    }else{
                        System.out.println("2");
                    }
                    break;

                case 3:
                    if(c <= b){
                        System.out.println("1");
                    }else if(c > (b*2)){
                        System.out.println(false);
                    }else{
                        for(int i = 0; i < c; i++){
                            dizi[i] = i;
                            toplam += i;
                            sayac++;
                        }
                        System.out.println(sayac);
                    }
                    break;

                case 4:
                    if(c <= b){
                        System.out.println("1");
                    }else if(c > (b*2)){
                        System.out.println(false);
                    }else {
                        for (int i = 0; i < c; i++) {
                            dizi[i] = i;
                            toplam += i;
                            sayac++;
                        }
                        System.out.println(sayac);
                    }
                    break;

                case 5:
                    if(c <= b){
                        System.out.println("1");
                    }else if(c > (b*2)){
                        System.out.println(false);
                    }else {
                        for (int i = 0; i < c; i++) {
                            dizi[i] = i;
                            toplam += i;
                            sayac++;
                        }
                        System.out.println(sayac);
                    }
                    break;

                case 6:
                    if(c <= b){
                        System.out.println("1");
                    }else if(c > (b*2)){
                        System.out.println(false);
                    }else {
                        for (int i = 0; i < c; i++) {
                            dizi[i] = i;
                            toplam += i;
                            sayac++;
                        }
                        System.out.println(sayac);
                    }
                    break;

                case 7:
                    if(c <= b){
                        System.out.println("1");
                    }else if(c > (b*2)){
                        System.out.println(false);
                    }else {
                        for (int i = 0; i < c; i++) {
                            dizi[i] = i;
                            toplam += i;
                            sayac++;
                        }
                        System.out.println(sayac);
                    }
                    break;

                case 8:
                    if(c <= b){
                        System.out.println("1");
                    }else if(c > (b*2)){
                        System.out.println(false);
                    }else {
                        for (int i = 0; i < c; i++) {
                            dizi[i] = i;
                            toplam += i;
                            sayac++;
                        }
                        System.out.println(sayac);
                    }
                    break;

                case 9:
                    if(c <= b){
                        System.out.println("1");
                    }else if(c > (b*2)){
                        System.out.println(false);
                    }else {
                        for (int i = 0; i < c; i++) {
                            dizi[i] = i;
                            toplam += i;
                            sayac++;
                        }
                        System.out.println(sayac);
                    }
                    break;
            }

        }

            for(int i = 10; i < 100; i++){
                if(a >= 10){
                    System.out.println(d);
                }
            }
        }


    }
}