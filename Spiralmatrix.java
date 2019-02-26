package wiproprp;
import java.util.*;
public class Spiralmatrix
{
            private static Scanner sc;

			public static void main(String[] args) {
			sc = new Scanner(System.in);
			int m,n,ele=1;
			m = sc.nextInt();
			n = sc.nextInt();
			int mat[][]=new int[m][n];
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					mat[i][j]=ele;
                    ele++;
				}
			}
			int j=0,i=0,f,d,b,u;
			int temp = n;
			for(int l=0,g=n;g>l;l++,g--) {
				for( f=i;f<temp;f++) {
					System.out.print(mat[j][f]+" ");
				}f-=1;
				j++;
				for(d=j;d<m;d++) {
					System.out.print(mat[d][f]+" ");
				}
				d=d-2;
//				System.out.println("dvalue");
//				System.out.println(d);
				for(b=d;b>=i;b--) {
					System.out.print(mat[f][b]+" ");
				}b++;
				d=d-2;
				for(u=d;u>=j;u--) {
					System.out.print(mat[u][b]+" ");
				}
				temp--;
				
				i++;
			}
			
		}

}


