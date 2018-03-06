package com.stackroute.datamunger;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class repeatingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input1:");
			String b,data=br.readLine();	
			char data1[]=data.toCharArray();
			System.out.println("input2:");
			int n=Integer.parseInt(br.readLine());
			int i,j=0,l=data.length()-n;
			char a[]=new char[n];
			for(i=l;i<data1.length;i++)
			{
				a[j]=data1[i];
				j++;
			}
			b=new String(a);
			for(i=0;i<n;i++)
			{
				data=data+b;
			}
			System.out.println(data);
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

}
