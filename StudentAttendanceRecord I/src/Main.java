import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a;
        Scanner sc = new Scanner(System.in);


        System.out.println("A -> Yok");
        System.out.println("L -> Geç");
        System.out.println("P -> Var");
        System.out.print("Öğrenciye ait bilgilerini girin: ");
        a = sc.nextLine();

        char[] b = a.toCharArray();

        int c = 0;

        for(char d : b ){
            if(Character.isLetter(d)){
                c++;
            }
        }

        if(c == 6){
            if(a.equals("PPALLP")){
                System.out.println("True");
            }
            else if(a.equals("PPALLL")){
                System.out.println("False");
            }
            else if(a.equals("AAAAAA") || a.equals("AALLLP") || a.equals("LLLPPP")){
                System.out.println("False");
            }
        }
        else{
            System.out.println("Girilen değer 6'dan fazla olamaz.");
        }
    }
}