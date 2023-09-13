import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int length, width, height,mass;

        Scanner sc = new Scanner(System.in);

        System.out.print("Uzunluk girin: ");
        length = sc.nextInt();

        System.out.print("Genişliği girin: ");
        width = sc.nextInt();

        System.out.print("Yüksekliği girin: ");
        height = sc.nextInt();

        System.out.print("Ağırlığı girin: ");
        mass = sc.nextInt();

        if (mass >= 100){
            System.out.println("Kutu ağır !");
        }
        else if (length * height >= 1000 ){
            System.out.println("Kutunun hacmi büyük !");
        }
        else if (length * width >= 1000 ){
            System.out.println("Kutunun hacmi büyük !");
        }
        else if (height * width >= 1000 ){
            System.out.println("Kutunun hacmi büyük !");
        }
        else if (mass >= 100 && (length * height >= 1000) || (length * width >= 1000 ) || (height * width >= 1000 ) ){
            System.out.println("Kutu Ağır ve Hacimli !");
        }
        else if(mass >= 100 && (length * height <= 1000) || (length * width <= 1000 ) || (height * width <= 1000 )){
            System.out.println("Kutu Ağır");
        }
        else if(mass <= 100 && (length * height >= 1000) || (length * width >= 1000 ) || (height * width >= 1000 )){
            System.out.println("Kutu Hacimli !");
        }else {
            System.out.println("Kutunun ağırlığı ve hacmi normaldir.");
        }

    }
}