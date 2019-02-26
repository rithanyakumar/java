package wiproprp;
import java.util.*;

class CommonCharacter
{
  private static Scanner r;

public static void main(String[] args)
  {
    r = new Scanner(System.in);
    String s=r.nextLine();
    String c=r.nextLine();
    int l=s.length();
    int l1=c.length();
    ArrayList <Character> s1=new ArrayList<Character>();
    ArrayList <Character> s2=new ArrayList<Character>();
    Collections.sort(s1);
    Collections.sort(s2);
    if(l==l1)
    {
      for(int i=0;i<l;i++)
      {
        s1.add(s.charAt(i));
        s2.add(c.charAt(i));
      } 
      int count=0;
      int t=s1.size();
      int i=0;
      for(char a:s1)
      {
    	  System.out.println(a);
		for(char b:s2)
		{
			if(a==b)
                count++;
		}
		
      }
      System.out.println(count);
      if(count==t)
        System.out.println("Anagram");
      else
    	  System.out.println("Not an Anagram"); 
    }
    else
      System.out.println("Not an Anagram");
  }
}
