package Arrays;/*
Given an integer array nums,
return true if any value appears at least twice in the array,
and return false if every element is distinct.

Solution:
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<Integer>();
        for (int num : nums) {
            if (numbers.contains(num)) return true;
            numbers.add(num);
        }

        return false;
    }
}
 */

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        assert nums.length <= Math.pow(10,5);
        for (int i : nums) {
            assert i <= -Math.pow(10,9) && i <= Math.pow(10,9);
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[0]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();

        System.out.println(cd.containsDuplicate(new int[]{1, 2, 3, 1}));

        System.out.println(cd.containsDuplicate(new int[]{1, 2, 3, 4}));

        System.out.println(cd.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}
