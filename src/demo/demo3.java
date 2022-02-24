package demo;
/*3.给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。

        示例 1：
        输入：nums = [1,2,3,1]
        输出：true

        示例 2：
        输入：nums = [1,2,3,4]
        输出：false
        示例 3：
        输入：nums = [1,1,1,3,3,4,3,2,4,2]
        输出：true
        */

import java.util.Arrays;

public class demo3 {
    public static void main(String[] args) {


    }

    public boolean containsDuplicate(int[] nums) {
        boolean a = false;
        // 直接超时 效率很低
        //  for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) {
        //             a = true;
        //         }
        //     }
        // }
        // return a;
        // 对数组排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                a = true;
            }
        }
        return a;
    }


}