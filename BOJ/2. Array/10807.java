import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cnt=0;
        int[] arr = new int[100];

        int N = scanner.nextInt();
        for(int i = 0; i < N; i++) {
            
            arr[i] = scanner.nextInt();  
        }
        int v = scanner.nextInt();
        
        for(int i = 0; i < N; i++) {
           if(arr[i] == v)cnt++;
        }
        
        System.out.print(cnt);
    }
}