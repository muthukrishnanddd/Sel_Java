package week1.day2;

public class StringCountChar {

	public static void main(String[] args) {
		String compName="Cognizant";
		char searchChar='t';
		char[] charArray = compName.toCharArray();
		int count=0;
		for (int i=0;i<=charArray.length-1;i++) {
			if(charArray[i]==searchChar) {
				count +=1;
			}
		}
		System.out.println("Count of char("+searchChar+") : "+ count);
		


	}

}
