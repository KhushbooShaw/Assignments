package com.stackroute.datamunger;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class palindrome {
	public static void main(String[] ar)
	{
		try
		{
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   System.out.println("Enter a number:");
		   int r,temp,temp1=0,sum=0,n=Integer.parseInt(br.readLine());
		   temp=n;
		   while(n>0)
		   {
			   r=n%10;
			   temp1=temp1*10+r;
			   if(r%2==0)
			   {
				   sum=sum+r;
			   }
			   n=n/10;
		   }
		   if(temp==temp1)
		   {
			 if(sum>25)
			 {
				System.out.println(temp+" is palindrome and the sum of even numbers is greater than 25."); 
			 }
			 else
			 {
				 System.out.println(temp+" is palindrome and the sum of even numbers is less than 25."); 
			 }
		   }
		   else
		   {
			   System.out.println(temp+" is not palindrome.");
		   }
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
