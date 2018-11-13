import java.util.*;
public class Win{
    static	long factor(long n)
	{
		int a;
		if(n%2==0) return 2;
		for(a=3;a<=Math.sqrt(n);a=a+2)
		{
			if(n%a==0) return a;
		}
		return n;
	}
	
	public static void main(String[] args)
	{
		boolean win=false;
		Scanner  sc= new Scanner(System.in);
		long n=sc.nextLong();
    long r;
    List<Long> list=new ArrayList();
    if(n==1) {System.out.println("1");
	System.out.println("0");}
	else{
	while(n>1)
	{
		r=factor(n);
		list.add(r);
		
		if(list.size()==3)
		{
			win=true;
			break;
		}
		n/=r;
	}
	if(list.size()==1){
	    System.out.println("1");
	    System.out.println("0");

	}
	else if(win){
		System.out.println("1");
		System.out.println(list.get(0)*list.get(1));
	}
	else{System.out.println("2");}
}
	}

}