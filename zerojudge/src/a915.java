
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class a915 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        List b = Arrays.asList(a);

    }

    public void sort2d(int[][] arr, int column) {
        Arrays.sort(arr, new Comparator<int[]>(){
            @Override
            public int compare(int[] val1, int[] val2) {
                if(val1[column-1] > val2[column-1]){
                    return 3;
                }else{
                    return -8;
                }
            }
        });
    }
        
}


