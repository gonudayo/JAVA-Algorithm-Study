import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		String str = br.readLine();
        
		StringTokenizer st = new StringTokenizer(str," ");
		int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        System.out.print(Math.min(a, Math.min(b, c))+" ");
        if(Math.max(a, Math.max(b, c)) != a && Math.min(a, Math.min(b, c)) != a) System.out.print(a+" ");
        else if(Math.max(a, Math.max(b, c)) != b && Math.min(a, Math.min(b, c)) != b) System.out.print(b+" ");
        else System.out.print(c+" ");
        System.out.print(Math.max(a, Math.max(b, c))+" ");
        
    }
}