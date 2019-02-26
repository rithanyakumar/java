package wiproprp;

import java.util.Scanner;

public class StringDistanceReplacement {
	private static Scanner r;

	public static void main(String[] args) {
		r = new Scanner(System.in);
        String  s=r.nextLine();
        char c[]=s.toCharArray();
        char d[]=new char[c.length];
        for(int i=0;i<c.length-1;i++)
        {
        	if(Character.isAlphabetic(c[i]) && Character.isAlphabetic(c[i+1]))
        	{
        	int a=(int)c[i];
        	int b=(int)(c[i+1]);
        	int f=a-96+b-96;
        	if(f>26)
        	{
        		f=f%26;
        	}
        	f=f+96;
        	d[i]=(char)f;
        	}
//        	else {
//        		System.out.println(s);
//        		return ;
////        		break;
//        	}
//        	
        }
        int flag=0;
        for(int i=0;i<c.length;i++) {
        	if(Character.isDigit(c[i])) {
        		flag =1;
        	}
        }
        if(flag==0) {
        	for(int i=0;i<c.length;i++)
            {
            	if(i==0)
            	{
            	   System.out.print(c[i]);
            	}
            	else  {
            		System.out.print(d[i-1]);
                   System.out.print(c[i]);
            		}
            	
            }

        }
        else {
        	System.out.print(s);
        }
        
        
        	}
}
