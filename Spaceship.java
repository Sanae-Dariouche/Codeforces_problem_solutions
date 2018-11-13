import java.util.*;
public class Spaceship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] tab=new long[n];
		boolean b=true;
		long sum=0;
		int j=-1;
		for(int i=0;i<n;i++) {
			tab[i]=sc.nextLong();
			sum+=tab[i];
		}
		
			for(int i=0;i<n;i++)
			{
				if(2*tab[i]-sum==0)
				{
					j=i;
					break;
				}
			}
			for(int i=0;i<n;i++)
			{
				if(i!=j)
				System.out.print(tab[i]+" ");
			}
			System.out.println(tab[j]);
		
		
	}

}