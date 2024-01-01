class Solution {
    public int reverse(int x) {
        boolean negative = false;
        if(x==-2147483648 || x==2147483647){
            return 0;
        }
        if (x < 0) {
            negative = true;
            x *= -1;
        } else if (x >= 0 && x <= 9) {
            return x;
        }
        String s = String.valueOf(x);
        int n = s.length();
        int output = 0;
        int i;
        for (i = n - 1; i >= 0; i--) {
            int rem = x % 10;
            if(i==9 && rem>2){
                output=0;
                break;
            }
            x /= 10;
            long b = rem * ((long) Math.pow(10, i));
            if (output+b > 2147483647) {
                return 0;
            }
            output += (int) b;
            
        }
        if (negative == true) {
            output *= -1;
        }
        return output;

    }
}
