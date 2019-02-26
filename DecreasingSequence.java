package wiproprp;

public class DecreasingSequence 
{
	public static void main(String[] args)
	{
	//	Scanner r=new Scanner(System.in);

	    int a[]= {12,15,21,29,69,79};
	    int j=0,c=0,seq=0;
	   int n=a.length;
	  // System.out.println(seq);
	    for(int i=0;i<=n-1;i++)
	    {
	    	//System.out.println("1");
	    	j=i;
	    	c=0;
//	    	while( a[j]>a[j+1])
//	    	{
//	    		c=c+1;
//	    		j++;
////	    		m=j;
//	    	}
	    	System.out.println(c);
	    	
	    	if(c>seq)
	    	{
	    		seq=c;
	    		System.out.println(seq);
	    	}
	    	
	    	
	    	
	    }
		System.out.println(seq);
		 
	}

}
