import java.util.*;
public class Ball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		int n=sc.nextInt();
		int[] boys=new int[n];
		for(int i=0;i<n;i++)
		{
			boys[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int[] girls=new int[m];
		for(int i=0;i<m;i++)
		{
			girls[i]=sc.nextInt();
		}
		Arrays.sort(girls);
		Arrays.sort(boys);
		int i=m-1,j=n-1;
		while(i>=0 && j>=0) 
		{
			if(Math.abs(girls[i]-boys[j])<=1)
			{
				i--;j--;
				count++;}
			
			else {
				if(boys[j]>girls[i])
				j--;
				else if(girls[i]>boys[j])
					i--;
			}
		}
		
		System.out.println(count);
	}

}