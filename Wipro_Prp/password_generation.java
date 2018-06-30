/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
public class Main
{
    static int getSum(int n)
    {    
        int sum = 0;
         
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
     
    return sum;
    }
    public static void main(String[] args) throws Exception {
        
		Scanner s=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the customer name:");
		String name=br.readLine();
		int len1=name.length();
		System.out.println("Enter the mobile number:");
		long mobile=s.nextLong();
		System.out.println("Enter the floor:");
		String floor=br.readLine();
		int len2=floor.length();
		System.out.println("Enter the city:");
		String city=br.readLine();
		int b;
		if(name.contains(" "))
		{
		    String [] words=name.split(" ");
		    String word=words[1];
		    char c=word.charAt(1);
		    int a=c;
		   b=getSum(getSum(a));
		
		}
		else
		{
		    char c=name.charAt(0);
		    int a=c;
		    b=getSum(getSum(a));
		}
		Integer m= (int) (long) mobile;
		int mob=getSum(getSum(m));
		mob=mob-1;
	    String num=floor.replaceAll("[^0-9]","");
	    int num1=Integer.parseInt(num);
	    int floor_num=getSum(num1);
	    char ch=city.charAt(0);
	    int cit=ch;
	    int city_num=cit%10;
	    char special= (char)city_num;
	    System.out.println(special);
	   
	    System.out.println("Your Password is:"+b+""+mob+""+floor_num+""+special);
		}
	}
