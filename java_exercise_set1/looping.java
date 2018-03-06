package com.stackroute.datamunger;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the range:");
			int i,j,r=Integer.parseInt(br.readLine());
			for(i=1;i<=r;i++)
			{
				for(j=1;j<=i;j++)
				{
				  System.out.print(i+" ");
				}
			}
		}
        catch (Exception e) {
			// TODO: handle exception
		}
	}

}
