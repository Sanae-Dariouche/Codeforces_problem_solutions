import java.util.*;
public class NY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				if(Character.getNumericValue(s.charAt(i))%2!=0){
					count++;
				}
			}
			else {
				if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='u' || s.charAt(i)=='i' || s.charAt(i)=='o') count++;
			}
			
		}
		System.out.println(count);
	}

}