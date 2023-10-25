import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç rakam gireceksiniz: ");
        a = sc.nextInt();


        int[] dizi = new int[a];

        System.out.print("Rakamı girin: ");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextInt();
        }

        if(a == 1){
            if (dizi[0] == 1){
                System.out.println("[]");
            } else if (dizi[0]== 2) {
                System.out.println("[a,b,c]");
            } else if (dizi[0]== 3) {
                System.out.println("[d,e,f]");
            } else if (dizi[0]== 4) {
                System.out.println("[g,h,i]");
            } else if (dizi[0]== 5) {
                System.out.println("[j,k,l]");
            } else if (dizi[0]== 6) {
                System.out.println("[m,n,n]");
            } else if (dizi[0]== 7) {
                System.out.println("[p,q,r,s]");
            } else if (dizi[0]== 8) {
                System.out.println("[t,u,v]");
            } else if (dizi[0]== 9) {
                System.out.println("[w,x,y,z]");
            }else{
                System.out.println("2-9 arasında bir sayı girin");
            }
        }

        if(a == 2){
            if (dizi[0] == 1 && dizi[1] == 1){
                System.out.println("[]");
            } else if (dizi[0]== 2 || dizi[1] ==2) {
                System.out.println("[a,b,c]");
            } else if (dizi[0]== 3 || dizi[1] ==3) {
                System.out.println("[d,e,f]");
            } else if (dizi[0]== 4 || dizi[1] ==4) {
                System.out.println("[g,h,i]");
            } else if (dizi[0]== 5 || dizi[1] ==5) {
                System.out.println("[j,k,l]");
            } else if (dizi[0]== 6 || dizi[1] ==6) {
                System.out.println("[m,n,n]");
            } else if (dizi[0]== 7 || dizi[1] ==7) {
                System.out.println("[p,q,r,s]");
            } else if (dizi[0]== 8 || dizi[1] == 8) {
                System.out.println("[t,u,v]");
            } else if (dizi[0]== 9|| dizi[1] ==9) {
                System.out.println("[w,x,y,z]");
            }else{
                System.out.println("2-9 arasında bir sayı girin");
            }
        }

    }
}