import java.util.*;
public class Chew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String nouv="";
		boolean leading=true;
		for(int i=0; i<s.length();i++)
		{
			int n=Integer.parseInt(s.charAt(i)+"");
			if(i==0 && n==9) nouv=nouv+9;
			else if(9-n<n) nouv=nouv+(9-n);
			else if(9-n>=n) nouv=nouv+n;
			
		}
		
		System.out.println(nouv);
	}

}