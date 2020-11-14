/*
package srcjava;
import java.util.*;

*/
/* Soalnya ini Binary Number. Jadi Kita mencari berapa angka 1 di urutan dalam satu waktu. Ketika 0101 maka 1 kali karena
* ada 0 disitu sehingga reset kembali. Ketika berikutnya ada 1 kayak 01100 maka dia akan counter *//*

public class day10hackerrank {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int counter = 0, max =0;
        while (n > 0) {
            int rem = n%2;
            if (rem==1) counter++;
            else counter=0;
            max = Math.max(counter, max);
            n/=2;
        }
        System.out.println(max);
        scanner.close();
    }
}
*/
