package com.stackroute.datamunger;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class oddeven {
	public static void main(String[] ar)
	{
		try
		{
			   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			   System.out.println("Enter a number:");
			   int n=Integer.parseInt(br.readLine());
			   if(n%2!=0 & (n<=30 & n>=20))
			   {
				   System.out.println("Tom");
			   }
			   else if(n%2==0 & (n<=30 & n>=20))
			   {
				   System.out.println("Jerry");
			   }
			   else
			   {
				   System.out.println("Number is not meeting the specified range and criteria.");
			   }
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
