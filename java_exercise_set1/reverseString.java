package com.stackroute.datamunger;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a string:");
			String s,data1=br.readLine();
			char data[]=data1.toCharArray();
			char rev[]=new char[data1.length()];
			int i,j=0;
			for(i=data.length-1;i>=0;i--)
			{
				rev[j]=data[i];
				j++;
			}
			s=new String(rev);
			System.out.println("reverse:"+s);
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

}
