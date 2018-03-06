package com.stackroute.datamunger;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class increasingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the number:");
			String data=br.readLine();
			int a[]=new int[data.length()];
			int sum=0,j,t,i=0,n=Integer.parseInt(data);
			boolean value=false;
			while(n>0)
			   {
				   a[i]=n%10;
				   
				   if(a[i]%2==0)
				   {
					   sum=sum+a[i];
				   }
				   n=n/10;
				   i++;
			   }
			for(i=0;i<a.length;i++)
			{
				for(j=i;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						t=a[i];
						a[i]=a[j];
						a[j]=t;
					}
				}
			}
			if(sum>=15)
			{
				value=true;
			}
			System.out.print("Sorted number in non-increasing order :");
			for(i=0;i<a.length;i++)
			{
				System.out.print(a[i]);
			}
			System.out.println("\nSum of even numbers :"+sum);
			System.out.println(value);
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

}
