package wiproprp;
import java.util.*;
public class Array_replace {
	 private static Scanner r;

	public static void main(String args[] ) throws Exception {
	        r = new Scanner(System.in);
	        int n=r.nextInt();
	        long [] a=new long[n];
	        long [] b=new long[n];
	        long sum=0,grt=0;
	        int l=0;
	        for(int i=0;i<n;i++)
	        {
	          a[i]=r.nextLong();
	          sum=sum+a[i];
	        }
	        for(int i=0;i<n;i++)
	        {
	            grt=0;
	            for(int j=0;j<n;j++)
	            {
	                grt=grt+a[i];
	            }
	            if(grt>sum)
	            {
	                b[l]=a[i];
	                l++;
	            }
	        }
	        Arrays.sort(b);
	          for(int i=0;i<n;i++)
	        {
	        if(b[i]!=0)
	        {
	        System.out.println(b[i]);
	        break;
	        }
	        }
	    
	    }

}
