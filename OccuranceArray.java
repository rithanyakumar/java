
package wiproprp;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class OccuranceArray 
{
private static Scanner r;

public static void main(String[]args)
{
	r = new Scanner(System.in);
	int num=r.nextInt();
	int z[]=new int[num];
	for(int i=0;i<num;i++)
	{
		z[i]=r.nextInt();
		
	}
	int [] c=new int[100];
	int n=0;
     for(int i=0;i<num;i++)
     {
    	 int rem=0;
    	 while(z[i]!=0)
    	 {
    		 rem=(z[i])%10;
    		 z[i]=z[i]/10;
    		 c[n]=rem;
    		 n++;
    	 }
     }
    int [] a=new int[n];
     for(int i=0;i<n;i++)
    	a[i]=c[i];
     
   TreeSet<Integer> t= new TreeSet<Integer>();
    for(int i = 0;i<a.length;i++)
    {
    	t.add(a[i]);
    }
    HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
    for(int ts:t)
    {
    	int count=0;
    	for(int j=0;j<c.length;j++)
    	{
    		if(ts==c[j])
    			count++;	
    	}
    	m.put(ts,count);
    }

	int s[]=new int[m.size()];
	int t1[]=new int [m.size()];
	int p=0;
	for (Integer key : m.keySet()) 
	{
		s[p]=key;
		p++;
	}
	p=0;
	for (Integer value : m.values()) 
	{
	       t1[p]=value;
	       p++;
	 }
   //PRINT THE OCCURANCE OF NUMBER IN DESCENDIING ORDER
	
	for(int i=0;i<t1.length-1;i++)
	{
		if(t1[i]>t1[i+1])
		{
			int temp;
			temp=t1[i];
			t1[i]=t1[i+1];
			t1[i+1]=temp;
			int temp1;
			temp1=s[i];
			s[i]=s[i+1];
			s[i+1]=temp1;
		}	
	}
	for(int i=s.length-1;i>=0;i--)
		 System.out.print(s[i]+" " );
		 
		
	
	
	//HIGHEST OCCURANCE OF THE NUMBER
	/*int larger=0,d=0;
	for(int i=0;i<s.length;i++)
	{
		if(t1[i]>=larger)
		{
			larger=t1[i];
			d=s[i];
		}
	}
	System.out.println(d+" occurs "+larger);*/
	}
}