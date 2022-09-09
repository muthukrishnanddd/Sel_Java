package Practice;

import java.util.Arrays;

public class Arraytest {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		int[] array2 = { 1, 2, 3, 4, 5 };
		int[] anArray = new int[10];
		anArray[0]=12;
		anArray[2]=13;
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}	
		System.out.println();
		for(int i=0;i<anArray.length;i++) {
			System.out.print(anArray[i]+ " ");
		}
		
		System.out.println();
		for(int i=0;i<array2.length;i++) {
			System.out.println(array2[i]+ " ");
		}
		//Question: Can you assign an Array of 100 elements to an array of 10 elements?
		//Answer: Yes, In Java an Array of 100 elements can be assigned to an Array of 10 elements.  The only conditions is that, they should be of same type. Because while assigning values the compiler checks only type of the array and not the size
		System.out.println("=========assignment check==========");
        int[] arrayWitTen = new int[] {1,2,3};
        
        int[] arrayWith6 = new int[] {4,5,6,7,8,9};
        arrayWitTen=arrayWith6;

 		for(int i=0;i<arrayWitTen.length;i++) {
 			System.out.print(arrayWitTen[i]+ " ");
 		}
 		
 		System.out.println();
 		for(int i=0;i<arrayWith6.length;i++) {
 			System.out.println(arrayWith6[i]+ " ");
 		}
 		
		System.out.println("=========Loop method 2==========");		
 		for(int i:arrayWith6) {
 			System.out.print(i + "---- ");
 		}
		System.out.println("=========Merging==========");	
		
		int array11[] = { 1, 2, 3, 4, 5 };
		int[] array12 = { 6,7,8 };
		int[] result = new int[array11.length + array12.length];
		
		System.arraycopy(array11, 0, result, 0, array11.length);  
		System.arraycopy(array12, 0, result, array11.length, array12.length);  
		System.out.println(Arrays.toString(result));    //prints the resultant array  
		
		System.out.println("=========Char array to String ==========");	
		
		System.out.println(Arrays.toString(array11));
		
	}

}
