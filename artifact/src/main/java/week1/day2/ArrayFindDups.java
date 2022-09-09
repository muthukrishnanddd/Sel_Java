package week1.day2;

import java.util.Arrays;

public class ArrayFindDups {

	public static void main(String[] args) {
		int[] nums = {12, 25, 12, 56, 89, 25};
		Arrays.sort(nums);
		int len = nums.length;
		System.out.println("length :"+len);
		for (int i=0;i<len-1;i++) {
			System.out.println(nums[i]);
			if (nums[i]==nums[i+1]) {
				System.out.println("Duplicates"+ nums[i]);
			}
		}
		
	}

}
