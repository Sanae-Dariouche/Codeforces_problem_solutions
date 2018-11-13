import java.util.*;
public class Pal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		boolean b=true;
		int count=0;
		for(int i=0;i<s.length()/2;i++)
		{
			
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) 
			{
				b=false;
				count++;
				
			}
		}
	
		if(count==0 && s.length()%2!=0) System.out.println("YES");
		else if(!b && count==1) System.out.println("YES");
		else System.out.println("NO");
	}

}