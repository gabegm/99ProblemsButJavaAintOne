/*
Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.

Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
 */

package Arrays;

import java.util.Arrays;

// O(n)
public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();

        System.out.println(mn.missingNumber(new int[]{3, 0, 1}));

        System.out.println(mn.missingNumber(new int[]{0, 1}));

        System.out.println(mn.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
