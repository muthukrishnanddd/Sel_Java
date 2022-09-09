package week1.day2;

import java.util.Arrays;

public class ArrayMinMax {

	public static void main(String[] args) {
		
		int[] nums = {22, 3981, -19, 82, 0, 45, 37};
		Arrays.sort(nums);
		int len=nums.length;
		System.out.println("Min value :"+nums[0]);
		System.out.println("Max Value :"+ nums[len-1]);		


	}

}
