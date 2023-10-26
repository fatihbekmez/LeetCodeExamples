import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a,lw;
        Scanner sc = new Scanner(System.in);

        System.out.print("Cümleyi girin: ");
        a = sc.nextLine();

        String[] b = a.split(" ");
        lw = b[b.length -1];

        System.out.println("Son kelime: "+ lw +" harf sayısı: " + lw.length());
    }
}