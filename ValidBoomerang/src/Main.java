import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        Scanner sc = new Scanner(System.in);

        System.out.println(" 1. dizinin elemanlarını sayısını yazın: ");
        int dizi1[] = new int[2];
        for (int i = 0; i < a; i++) {
            dizi1[i] = sc.nextInt();
        }

        System.out.println(" 2. dizinin elemanlarını sayısını yazın: ");
        int dizi2[] = new int[2];
        for (int i = 0; i < a; i++) {
            dizi2[i] = sc.nextInt();
        }

        System.out.println(" 3. dizinin elemanlarını sayısını yazın: ");
        int dizi3[] = new int[2];
        for (int i = 0; i < a; i++) {
            dizi3[i] = sc.nextInt();
        }

        if ((dizi1[0] == dizi1[1]) && (dizi2[0] == dizi2[1]) && (dizi3[0] == dizi3[1])) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
