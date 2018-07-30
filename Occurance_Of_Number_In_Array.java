package wiproprp;
import java.util.HashMap;
import java.util.TreeSet;

public class Occurance_Of_Number_In_Array
{
public static void main(String[]args)
{
	int a[]=new int[] {2,0,2,1,1,1,2,0,0,0};
	int b[]=new int[a.length];
    for(int i=0;i<a.length;i++)
    	b[i]=a[i];
    TreeSet<Integer> t= new TreeSet<Integer>();
    for(int i = 0;i<a.length;i++)
    {
    	t.add(a[i]);
    }
    HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
    for(int ts:t)
    {
    	int count=0;
    	for(int j=0;j<b.length;j++)
    	{
    		if(ts==b[j])
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
	
	/*for(int i=0;i<t1.length-1;i++)
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
		 
		 */
	
	
	//HIGHEST OCCURANCE OF THE NUMBER
	int larger=0,d=0;
	for(int i=0;i<s.length;i++)
	{
		if(t1[i]>=larger)
		{
			larger=t1[i];
			d=s[i];
		}
	}
	System.out.println(d+" occurs "+larger);
	}
}
