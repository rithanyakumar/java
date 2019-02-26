package wiproprp;
import java.util.*;
public class StringCode {
	private static Scanner r;

	public static void main(String [] args)
	{
	r = new Scanner(System.in);
	String[] s=r.nextLine().split(" ");
	int i=0;
	for(int j=0;j<s.length;j++)
	{
	String s1=s[j];
	System.out.println(s[j]);
	int j1=s1.length();
	            i=i+j1;   
	}
	int rem,k=0;
	while(i!=0)
	{
	rem=i%10;
	i=i/10;
	k=k+rem;
	}
	System.out.println(k);
	}
}



