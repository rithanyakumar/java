package wiproprp;
import java.util.Scanner;

public class Stringopr {
	private static Scanner r;
 public static void main(String [] args)
	{
	 r = new Scanner(System.in);
	     String s1=r.next();
	     String s2=r.next();
	     String s3=r.next();
	     int x,y,z;
	     if(s1.length()%3!=0)
	      x=s1.length()%3;
	     else
	    x=s1.length()/3;
	     if(s2.length()%3!=0)
	    y=s2.length()%3;
	     else
	    y=s2.length()/3;
	     if(s3.length()%3!=0)
	      z=s3.length()%3;
	     else
	    z=s3.length()/3;  
	     String o1=s1.substring(0,x) + s2.substring(y, s2.length()-y) + s3.substring(s3.length()-z,s3.length());
	     String o2=s2.substring(0,y) + s3.substring(y, s3.length()-z) + s1.substring(s1.length()-x,s1.length());
	     String o3=s3.substring(0,z) + s1.substring(x, s1.length()-x) + s2.substring(s2.length()-y,s2.length());
	     System.out.println(o1); 
	     System.out.println(o2);
	     System.out.println(o3);
	}


}
