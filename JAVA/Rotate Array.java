public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n == 0 || k % n == 0)
            return;
        k = k % n;
        int g = gcd(n, k);
        for(int p = 0; p < g; p++)
        {
            int j = p;
            int temp = nums[p];
            for(int i = 0; i < n / g; i++)
            {
                int t = temp;
                temp = nums[(j + k) % n];
                nums[(j + k) % n] = t;
                j = (j + k) % n;
            }
        }
    }
    
    private int gcd(int a, int b)
    {
        if (b > a)
        {
            int t = a;
            a = b;
            b = t;
        }
        if ( b == 0)
            return a;
        return gcd(a % b, b);
    }
}
