public class Solution {
    public List<List<Integer>> permutation(int n)
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(n == 1)
        {
            ArrayList<Integer> o = new ArrayList<Integer>();
            o.add(0);
            result.add(o);
            return result;
        }
        List<List<Integer>> temp = permutation(n - 1);
        for(int i = 0; i < temp.size(); i++)
        {
            for(int j = n - 1; j >= 0; j--)
            {
                ArrayList<Integer> o = new ArrayList<Integer>();
                for(int k = 0; k < j; k++)
                    o.add(temp.get(i).get(k));
                o.add(n - 1);
                for(int k = j + 1; k < n; k++)
                    o.add(temp.get(i).get(k - 1));
                result.add(o);
            }
        }
        return result;
    }
    
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> result = permutation(num.length);
        for(int i = 0; i < result.size(); i++)
            for(int j = 0; j < result.get(i).size(); j++)
                result.get(i).set(j, num[result.get(i).get(j)]);
        return result;
    }
}
