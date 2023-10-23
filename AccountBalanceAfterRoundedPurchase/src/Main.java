import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b = 0, bakiye;
        Scanner sc = new Scanner(System.in);

        System.out.print("Alınan ürünlerin toplam fiyatını girin: ");
        a = sc.nextInt();

        if (a == null){
            System.out.println("değer boş olamaz.");
        }else if(a > 100){
            System.out.println("Bakiyeyi aştınız ! ");
        }else{
            if(a % 10 != 0){
                b = ((a + 9) / 10 * 10);
            }
            bakiye = 100 - b;
            System.out.println("Kalan bakiye: " + bakiye);
        }
    }
}