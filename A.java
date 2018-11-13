import java.util.Scanner;
import java.util.*;
public class A{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean ch=true;
        String guest=sc.nextLine();
        String host=sc.nextLine();
        String mush=sc.nextLine();
        String mish=guest+host;
        
        char[] g=mish.toCharArray();
      
        Arrays.sort(g);
        char[] m=mush.toCharArray();
        Arrays.sort(m);
        if(mush.length()!=mish.length()) System.out.println("NO");
        else{
        for(int i=0;i<Math.min(m.length,g.length);i++)
        {
            if(g[i]!=m[i]) {System.out.println("NO");
                ch=false;
                break;
                
            }
        }
        if(ch) System.out.println("YES");
        }
    }
}