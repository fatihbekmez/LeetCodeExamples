import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci dizinin harflerini girin: ");
        String[] dizi1 = new String[4];
        for (int i = 0; i<4; i++){
            dizi1[i] = sc.nextLine();
        }

        System.out.println("İkinci dizinin harflerini girin: ");
        String[] dizi2 = new String[4];
        for(int i = 0; i < 4; i++){
            dizi2[i] = sc.nextLine();
        }

        System.out.println("Üçüncü dizinin harflerini girin: ");
        String[] dizi3 = new String[4];
        for(int i = 0; i < 4; i++){
            dizi3[i] = sc.nextLine();
        }

        System.out.print("Aranacak kelimeyi girin: ");
        a = sc.nextLine();

        for(int i = 0; i < a.length(); i++){
            char b = a.charAt(i);
        }

        boolean c = Arrays.asList(dizi1).contains(a) && Arrays.asList(dizi2).contains(a) &&
                Arrays.asList(dizi3).contains(a);
        System.out.println(c);
    }
}