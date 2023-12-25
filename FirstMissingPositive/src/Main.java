import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

      int a;
      Scanner sc = new Scanner(System.in);

      System.out.print("Eleman sayısını girin: ");
      a = sc.nextInt();

      int[] dizi = new int[a];

      System.out.println("Elemanları girin");
      for(int i = 0; i < a; i++){
          dizi[i] = sc.nextInt();
      }

      int b = 0;

      for(int j = 0; j < a; j++){
          if(dizi[j] < b){
              b = dizi[j];
          }
      }

      int toplam = 0;
      int toplam2 = 0;
      if(b < 0){
          Math.abs(b);
      }else{
          for(int k = 0; k < a; k++){
              toplam = dizi[dizi.length] - dizi[dizi.length-k];
              if(toplam > dizi[k]){
                  System.out.println(false);
              }else{
                  toplam2 = dizi[k] + 1;
                  if (toplam2 != dizi[k]){
                      System.out.println(toplam2);
                  }
              }
          }
      }



      for(int i = 0; i < a; i++){
          if(b > dizi[i]){
              System.out.println("Eksik eleman = 1");
          }else{
              System.out.println("Eksik eleman: " + b);
          }
      }

      

    }
}