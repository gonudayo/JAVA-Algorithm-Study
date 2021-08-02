import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str2 = new String("END");

        while(true) {
            String str = br.readLine();
            if(str.equals(str2)) break;
            StringBuffer sb = new StringBuffer(str); 
            String reversedStr = sb.reverse().toString();
            bw.write(reversedStr);
            bw.flush();
            bw.newLine();
        }
        bw.close();
    }
}