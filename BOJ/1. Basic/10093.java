import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
        
        if(a > b) {
            long temp = a;
            a = b;
            b = temp;
        }
        
        if(a-b==0) System.out.println(0);
        else System.out.println(b-a-1);
        
        for(long i = a+1; i < b; i++) {
            System.out.print(i+" ");
        }
    }
}