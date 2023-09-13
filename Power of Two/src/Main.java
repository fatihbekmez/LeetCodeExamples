import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int data = sc.nextInt();
        boolean isCheck = true;

        if (data % 2 == 0 || data == 1){
            isCheck = true;
            System.out.println(isCheck);
        }else{
            isCheck = false;
            System.out.println(isCheck);
        }

    }
}