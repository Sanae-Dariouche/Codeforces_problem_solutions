import java.util.*;
public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		boolean b=true;
		for( int i=65;i<91;i++)
		{
			if(!(s.contains(((char) i)+"") || s.contains(((char) (i+32))+""))) {
				b=false;
				
			}
		}
		if(b) System.out.println("YES");
		else System.out.println("NO");
	}

}