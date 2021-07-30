import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] resultCard = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] reverseCard = new int[21];

        for(int i = 0; i < 10; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int k = 0;

            for(int j = b; j >= a; j--) { 
                reverseCard[k++] = resultCard[j];
            }
            k = 0;
            for(int j = a; j <= b; j++) {
                resultCard[j] = reverseCard[k++]; 
            }
             
        }
        
        for(int i = 1; i < 21; i++) {
           System.out.print(resultCard[i]+" ");
        }
    }
}