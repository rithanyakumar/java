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
//	String s3=String.valueOf(d);
//	System.out.println(s3);
	// * 12345732128989543219
	// * 987612673489652*/


       /*     BigInteger number1;
            BigInteger number2;
            BigInteger sum;
            String g="";
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of number 1");
            number1 = sc.nextBigInteger();
            System.out.println("Enter the value of number 2");
            number2 = sc.nextBigInteger();
            BigInteger a = new BigInteger(""+number1);
            BigInteger b = new BigInteger(""+number2);
            BigInteger result = a.add(b);

            System.out.println("Sum is Two numbers : -> " + result);
            g=g+String.valueOf(result);
            System.out.println(g);*/
        }

    }

