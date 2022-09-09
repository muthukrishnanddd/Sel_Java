package Practice;

public class test {

	public static void main(String[] args) {
		int i,j,k;
		i=1;			
		System.out.println("i :" + i);//1
		j=i++;
		System.out.println("i :" + i); //2
		System.out.println("j :" + j); //1
		k=++i;
		System.out.println("k :" + k); //3
		
		int l,m,n;
		l=5;			
		System.out.println("l :" + l);//5
		m=l--;
		System.out.println("l :" + l); //4
		System.out.println("m :" + m); //5
		n=--l;
		System.out.println("n :" + n); //3
		
		
		
		System.out.println("========");
		String str1="COMP";
		String str2="COMP";
		String str3=new String("COMP");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1.equals(str2));
		

	}

}
