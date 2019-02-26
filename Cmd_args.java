package wiproprp;

import java.util.Arrays;

public class Cmd_args {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,total=0;
		for(int i=0;i<args.length;i++) {
			int arr[] = new int[args[i].length()];
			num = Integer.parseInt(args[i]);
			int digit,pow=1,ind=0;
			String str="";
			while(num/pow !=0) {
				digit = (num/pow)%10;
//				System.out.print(digit+" ");
				arr[ind++] = digit;
				pow = pow*10;
			}
			Arrays.sort(arr);
			
			for(int j=0;j<2;j++)
			{
			str+=String.valueOf(arr[j]);	
			}
			System.out.println(str);
			total += Integer.parseInt(str);
		}
		System.out.println(total);
	}

}
