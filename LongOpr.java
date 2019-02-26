package wiproprp;
import java.math.BigInteger;
import java.util.*;
public class LongOpr 
{
private static Scanner r;

public static void main(String[]args)
{
	r = new Scanner(System.in);
	String s=r.next();
	String s1=r.next();
	BigInteger bi =new BigInteger(s);
	BigInteger bi1 =new BigInteger(s1); 
	BigInteger sum;
	sum=bi.add(bi1);
	System.out.println(bi);
	System.out.println(bi1);
	System.out.println(sum);
	String g=String.valueOf(sum);
     System.out.println(g);

        }

    }

