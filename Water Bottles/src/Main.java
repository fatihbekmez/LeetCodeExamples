import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int numBottles;
        int excBottles;
        int newBottles = 0;

        System.out.print("Evde bulunan şişe sayısını giriniz: ");
        Scanner sc = new Scanner(System.in);
        numBottles = sc.nextInt();


        System.out.println("Değişem şişe sayısını girin: ");
        System.out.println("İçilen şişe için '-' operatörünü kullanın:  ");
        Scanner sc1 = new Scanner(System.in);
        excBottles = sc1.nextInt();

        if(numBottles <= 0 && numBottles == 100){
            if (excBottles > 0){
                newBottles = numBottles + excBottles;
            }else if(excBottles < 0){
                newBottles = numBottles - excBottles;
            }else {
                System.out.println("Minimum 0, Maksimum 100 şişe giriniz.");
            }
        }

        System.out.println(newBottles);
    }
}
