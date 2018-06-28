import java.util.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	int sum1=0,sum2=0,total=0;
	System.out.println("Enter the number:");
	int n=s.nextInt();
	System.out.println("Enter the option:");
	System.out.println("1. Numbers followed by + and - sequence");
	System.out.println("2. Numbers followed by - and + sequence");
	int op=s.nextInt();
	int n1=n-1;
	int n2=n-2;
	if(op==1)
	{
	for(int i=n1;i>0;i-=2)
	{
	    sum1+=i;
	}
	for(int i=n2;i>0;i-=2)
	{
	    sum2+=i;
	}
	total=sum1-sum2+n;
	System.out.println("Total is:"+total);
	
	}
	else if(op==2)
	{
	    for(int i=n1;i>0;i-=2)
	{
	    sum1+=i;
	}
	for(int i=n2;i>0;i-=2)
	{
	    sum2+=i;
	}
	total=sum2-sum1+n;
	System.out.println("Total is:"+total);
	
	}
	else
	{
	    System.out.println("Please enter the correct choice");
	}
	}
	}
