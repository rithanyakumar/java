package wiproprp;

import java.util.*;
class Square_free_number
{
   static boolean isPerfect(double num)
  {
    double n=Math.sqrt(num);
    return((n-Math.floor(num))==0);
  }
public static void main(String[] args)
{
 Scanner r=new Scanner(System.in);
  int number=r.nextInt();
  String str="";
  for(int i=1,j=0;i<number;i++,j++)
  {
    if(number%i==0)
      str+=String.valueOf(i)+" ";
  }
  String s[]=str.split(" ");
  int arr[]=new int[s.length];
  for(int j=0;j<s.length;j++)
    arr[j]=Integer.valueOf(s[j]);
  String str1="";
  for(int i=2;i<arr.length;i++)
  {
    if(isPerfect(arr[i]))
    {
      str1+=String.valueOf(arr[i])+" ";
    }
  }
  String arr1[]=str1.split(" ");
  int a[]=new int[arr1.length];
  for(int i=0;i<a.length;i++)
  {
    for(int j=0;j<arr.length;j++)
    {
     if(arr[j]%a[i]==0)
       arr[j]=0;
    }
  }
  int count=0;
  for(int i=0;i<arr.length;i++)
  {
    if(arr[i]>1)
      count++;
  }
  System.out.println(count);
}
}
