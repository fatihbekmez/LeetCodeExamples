import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Satır sayısını girin: ");
        a = sc.nextInt();

        System.out.println("Sütun sayısını girin: ");
        b = sc.nextInt();

        int[][] matrix = new int[a][b];

        for(int i =0; i <a; i++){
            for(int j=1; j<b; j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }

        int count=0;

        for(int i=0;i<b;i++){
            for(int j=i; j<b; j++){

                Map<Integer,Integer> map = new HashMap<>();
                map.put(0,1);
                int sum=0;

                for(int row=0;row<a;row++){
                    sum += matrix[row][j] - (i>0 ? matrix[row][j-1] : 0);
                    int target = 0;
                    count += map.getOrDefault(sum-target,0);
                    map.put(sum,map.getOrDefault(sum,0)+1);
                }

            }
        }

        System.out.println(count);
    }

}