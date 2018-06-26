import java.io.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String toggled="";
		int len=str.length();
		for(int i=0;i<len;i++)
		{
		    char c=str.charAt(i);
		    if(Character.isUpperCase(str.charAt(i)))
		    {
		        c=Character.toLowerCase(str.charAt(i));
		        toggled=toggled+c;
		    }
		    else
		    {
		        c=Character.toUpperCase(str.charAt(i));
		        toggled=toggled+c;
		    }
		        
		    }
		    System.out.println("The toggled case for the given word is:"+toggled);
		}
	}
