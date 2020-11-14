package srcjava;
import java.util.*;

public class day11hackerrank {
   /* static void coba(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int curr = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
                        + arr[i + 2][j + 2];
                max = Math.max(max, curr);
            }
        }
        System.out.println(max);

    }*/


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
           // String[] aldo={"111000"};
            String[] arrRowItems =scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        coba(arr);
    }
    public static void coba(int[][] arr) {
        int max_sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                int temp_sum = 0;
                // top row
                temp_sum += arr[i][j];
                temp_sum += arr[i][j + 1];
                temp_sum += arr[i][j + 2];
                //middle
                temp_sum += arr[i + 1][j + 1];
                //bottom row
                temp_sum += arr[i + 2][j];
                temp_sum += arr[i + 2][j + 1];
                temp_sum += arr[i + 2][j + 2];

                //if first hourglass, set as max
                if (temp_sum > max_sum) {
                    max_sum = temp_sum;///this will keep it up to date
                }
            }
        }
        System.out.println(max_sum);
    }
}


