package demo;
/*9.魔术索引。 在数组A[0...n-1]中，有所谓的魔术索引，满足条件A[i] = i。给定一个有序整数数组，编写一种方法找出魔术索引，若有的话，在数组A中找出一个魔术索引，如果没有，则返回-1。若有多个魔术索引，返回索引值最小的一个。

        示例1:
        输入：nums = [0, 2, 3, 4, 5]
        输出：0
        说明: 0下标的元素为0

        示例2:
        输入：nums = [1, 1, 1]
        输出：1*/


import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class demo8 {
    public static void main(String[] args) {
        System.out.println(findMagicIndex(new int[]{1, 1, 1}));
    }

    public static int findMagicIndex(int[] nums) {
       TreeSet<Integer> set=new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==i){
                set.add(i);
            }
        }
        return set.isEmpty()?-1:(int) set.first();
    }
}
