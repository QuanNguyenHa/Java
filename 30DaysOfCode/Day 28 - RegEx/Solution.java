import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Pattern p = Pattern.compile(".+@gmail\\.com");
        Matcher m;
        List<String> name = new ArrayList();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            
            
            
            m = p.matcher(emailID);
            if (m.matches()) {
                name.add(firstName);
            }
        }
        scanner.close();
        Collections.sort(name);
        for(String fname: name){
            System.out.println(fname);
        }
    }
}
