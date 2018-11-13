import java.util.*;
public class C{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int x;
		if(k>n) 
		System.out.println(k);
	else {
		x=k*(n/k)+k;
		System.out.println(x);
	}
	}
}