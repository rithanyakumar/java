package wiproprp;

import  java.util.*;

class possibleString
{

	private static Scanner r;
	public static String identifyPossibleWords(String input1,String input2){
		
		
		String l=input1.toLowerCase();
		String l2=input2.toLowerCase();
		String[] s=l2.split(":");
		String out="";
		int count=0;
		for(int i=0;i<s.length;i++)
		{
		for(int k=96;k<124;k++)
		{
			char a=(char)k;
			String g=l.replace('_',a);
			int colo=0;
				
				if(s[i].equals(g))
				{
					++colo;
					String h=g.toUpperCase();
					out=out+h;
					if(colo!=0)
					{
						out+=":";
					}
					
					count++;
				}
			}
				
		}
        
		if(count>0)
		{
			String m=out.substring(0,out.length()-1);
			return  m;
		}
		else
		{
		String r="ERROR-009";
			return r;	
		}
	}
	public static void main(String [] args)
	{
		 r = new Scanner(System.in);
		 String input1=r.nextLine();
		 String input2=r.nextLine();
		 String output=identifyPossibleWords(input1,input2);
		 System.out.println(output);
				 
	}
}