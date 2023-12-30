import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayısını girin: ");
        a = sc.nextInt();

        String[] dizi = new String[a];

        System.out.println("Elemanları girin");
        for(int i = 0; i < a; i++){
            dizi[i] = sc.nextLine();
        }

        int toplam = 0;

        for (int k = 0; k < a; k++){
            if(dizi[k].equals("*")){
                int b = Integer.parseInt(dizi[k-1]);
                int c = Integer.parseInt(dizi[k+1]);
                toplam = b * c;
            }else if(dizi[k].equals("+")){
                int d = Integer.parseInt(dizi[k-1]);
                int e = Integer.parseInt(dizi[k+1]);
                toplam += d + e;
            }else if(dizi[k].equals("-")){
                int f = Integer.parseInt(dizi[k-1]);
                int g = Integer.parseInt(dizi[k+1]);
                toplam += f-g;
            }else if(dizi[k].equals("/")){
                int h = Integer.parseInt(dizi[k-1]);
                int l = Integer.parseInt(dizi[k+1]);
                toplam += h/l;
            }
        }

        System.out.println(toplam);
    }
}