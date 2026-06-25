using System;
using System.Collections.Generic;

public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        Dictionary<int, int> numMap = new Dictionary<int, int>();
        for (int i = 0; i < nums.Length; i++) {
            int complement = target - nums[i];
            if (numMap.ContainsKey(complement)) {
                return new int[] { numMap[complement], i };
            }
            numMap[nums[i]] = i;
        }
        return new int[] { -1, -1 };
    }
}

public class Program {
    public static void Main() {
        Solution obj = new Solution();
        int[] aux = {2, 7, 11, 15};
        int[] result = obj.TwoSum(aux, 9);
        for (int i = 0; i < result.Length; i++) {
            Console.WriteLine(result[i]);
        }
    }
}