import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strA = scan.next();
        String strB = scan.next();
        scan.close();
        
        int[] arrA;
        arrA = new int[26];
        int[] arrB; 
        arrB = new int[26];
        int result = 0;

        for(int i = 0; i < strA.length(); i++) {
            arrA[((int)strA.toCharArray()[i])-97]++;
        }
        
        for(int i = 0; i < strB.length(); i++) {
            arrB[((int)strB.toCharArray()[i])-97]++;
        }
        
        for(int i = 0; i < 26; i++) {
            result += Math.max(arrA[i], arrB[i]) - Math.min(arrA[i], arrB[i]);
        }
        
        System.out.print(result);
    }
}