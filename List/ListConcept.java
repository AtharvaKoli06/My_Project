package List;

import java.util.*;
public class ListConcept {
    private static List<List<Integer>> res;
    public static List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        return new AbstractList<>() {
            public List<Integer> get(int index) {
                init();
                return res.get(index);
            }
            public int size() {
                init();
                return res.size();
            }
            private void init() {
                if (res != null) return;
                Arrays.sort(nums);
                int l, r;
                int sum;
                Set<List<Integer>> tempRes = new HashSet<>();
                for (int i = 0; i < nums.length - 2; ++i) {
                    l = i + 1;
                    r = nums.length - 1;
                    while (l < r) {
                        sum = nums[i] + nums[l] + nums[r];
                        if (sum == target) {
                            List<Integer> t = new ArrayList<>();
                            t.add(nums[i]);
                            t.add(nums[l]);
                            t.add(nums[r]);
                            tempRes.add(t);
                        }
                        if (sum < target) ++l;
                        else --r;
                    }
                }
                res = new ArrayList<List<Integer>>(tempRes);
            }
        };
    }
    public static List<List<Integer>> threeSum2(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        if(nums.length==0) return new ArrayList<>();
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0;i < nums.length-2;i++)
        {
            int j = i+1;
            int k = nums.length-1;
            while(j < k)
            {
                sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                if(sum<0) j++;
                if(sum>0) k--;

            }
        }
        return new ArrayList<>(set);

    }

    public static void main(String[] args) {
        int[] a = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(a));
        System.out.println(threeSum2(a));
    }
}
