class Solution {
    public int solution(int[] x, int[] y, int[] r, int[] v) {
        
        int l = x[0] - r[0];
        int rr = 0;
        int b = y[0] - r[0];
        int t = 0;
        
        for(int i = 0; i < x.length; i++) {
            l = Math.min(l, x[i] - r[i]);
            rr = Math.max(rr, x[i] + r[i]);
            b = Math.min(b, y[i] - r[i]);
            t = Math.max(t, y[i] + r[i]);
        }
        
        int cnt = 0;
        
        for(int i = 0; i < v.length; i+=2) {
            int TX = l + v[i] % (rr - l);
            int TY = b + v[i+1] % (t - b);
            
            for(int j = 0; j < x.length; j++) {
                int X = x[j];
                int Y = y[j];
                int R = r[j];
                
                if (Math.pow(R, 2) >= (Math.pow(X - TX, 2) + Math.pow(Y - TY, 2))) {
                    cnt++;
                    break;
                }
            } 
        }
        Double temp = ((double)cnt / ((double)v.length / 2)) * (double) (rr - l) * (t - b);
        return temp.intValue();
    }
}