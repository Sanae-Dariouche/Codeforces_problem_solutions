import java.util.*;
public class Devu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int t=0;
		int churu=0;
		
		
		for(int i=0;i<n;i++)
		{
			t=t+sc.nextInt();
		}
		t=t+10*(n-1);
		churu=2*(n-1);
		if(t>d) System.out.println("-1");
		else {
			while(t<d)
			{
				if(t+5<=d) {
				t=t+5;
				churu++;}
				else { break;}
			}
			System.out.println(churu);
		}
	}

}