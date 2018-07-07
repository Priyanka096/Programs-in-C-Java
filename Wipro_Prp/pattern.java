import java.util.Scanner;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		    int a=n;
		    int b=i+1;
		    for(int j=n;j>i;j--)
		    {
		        System.out.print(b+"\t");
		        b=b+a;
		        a--;
		        
		    }
		    System.out.print("\n");
		}
	}
}
