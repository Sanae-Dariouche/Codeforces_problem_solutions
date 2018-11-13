import java.util.Scanner;
public class Prosperous{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pair=8;
		int imp=0;
		long res=0;
		boolean done=false;
		
		if(n%2==0){
		    long x=(long)Math.pow(10,18);
			for(int i=0;i<n/2;i++)
			{
				if(x>res*10+8)
					res=res*10+8;
					
				else{done =true;}
			}
			if(done)  System.out.println("-1");
			else System.out.println(res);
			
		}
		else if(n==1) System.out.println("4");
		else{
			long x=(long)Math.pow(10,17);
			for(int i=0;i<n/2;i++)
			{
				if(x>res*10+8)
				res=res*10+8;
				else done = true;
			}
			if(done)  System.out.println("-1");
			else System.out.println(res+"0");
			
					

		}
	}
}