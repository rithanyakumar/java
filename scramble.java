import java.util.*;
public class scramble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1,str2,substr1,substr2,substr3,substr4;
		str1 = sc.nextLine();
		str2 = sc.nextLine();
		substr1 = str1.substring(0,str1.length()/2);
		substr2 = str1.substring(str1.length()/2,str1.length());
		substr3 = str2.substring(0,str2.length()/2);
		substr4 = str2.substring(str2.length()/2,str2.length());
		char [] a=substr1.toCharArray();
		char [] b=substr2.toCharArray();
		char [] c=substr3.toCharArray();
		char [] d=substr4.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		Arrays.sort(d);
// 		System.out.println(a);
// 		System.out.println(b);
// 		System.out.println(c);
// 		System.out.println(d);
		if(Arrays.equals(a,c) && Arrays.equals(b,d))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
