import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());

        for(int i = 0; i < b; i++) {
            for(int j = 0; j < a; j++){
                bw.write("*");
            }
            bw.flush();
            bw.newLine();
        }
        bw.close();
    }
}