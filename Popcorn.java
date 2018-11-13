import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class Popcorn {

	public static long fact(int n)
	{
		if(n<=1) return 1;
		else return n*fact(n-1);
	}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("popcorn.in");
		Scanner sc=new Scanner(fr);
		//Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		while(T>0) {
		int N=sc.nextInt();
		int M=sc.nextInt();
		if(M==0 || N==0) System.out.println("0");
		else {

		long res=fact(N)/(fact(M)*fact(N-M));
		System.out.println(res);
		}
		T--;}
	}

}