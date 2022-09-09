package week1.day2;

public class StringReverse {

	public static void main(String[] args) {
		String compName="TestLeaf";
		char[] charArray = compName.toCharArray();
		System.out.println(charArray);
		int len=charArray.length;
		System.out.println(len);
		for (int i=len-1;i>0;i--) {
			System.out.print(charArray[i]);
		}

	}

}
