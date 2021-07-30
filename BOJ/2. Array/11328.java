import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        
        for(int i = 0; i < N; i++) {
            
            int k = 0;
            String strA = scan.next();
            String[] strAArr = strA.split("");
            String strB = scan.next();
            String[] strBArr = strB.split("");
            
            Arrays.sort(strAArr);
            Arrays.sort(strBArr);
            
            for(int j = 0; j < strA.length(); j++) {
                if(strAArr[j].equals(strBArr[j])) {}
                else {
                    k = 1;
                    break;
                }
            }
            
            if(k == 1)System.out.println("Impossible");
            else System.out.println("Possible");
        }
    }
}