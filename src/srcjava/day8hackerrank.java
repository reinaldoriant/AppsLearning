/*
package srcjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class day8hackerrank {
    public static void main(String []argh){
        Map<String, Integer> phonebook= new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here

            phonebook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            int var=phonebook.getOrDefault(s,0);
            if(var==0){System.out.println("Not found");}
            else{System.out.println(s+"="+phonebook.get(s));}
        }
        in.close();
    }
}
*/
