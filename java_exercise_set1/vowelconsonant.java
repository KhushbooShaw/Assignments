package com.stackroute.datamunger;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class vowelconsonant {
	public static void main(String[] ar)
	{
		try
		{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int i;
			System.out.println("Enter a String:");
			String data=br.readLine();
			
			if(isString(data))
			{
		    for(i=0;i<data.length();i++)
		    {
		     
		    	if(data.charAt(i)=='a' | data.charAt(i)=='A' | data.charAt(i)=='e' | data.charAt(i)=='E' | data.charAt(i)=='i' | data.charAt(i)=='I' | data.charAt(i)=='o' | data.charAt(i)=='O' | data.charAt(i)=='u' | data.charAt(i)=='U')
		    	{
		    		System.out.println(data.charAt(i)+" - vowel");
		    	}
		    	else
		    		System.out.println(data.charAt(i)+" - consonant");
		      }
			}
		    
		}
		catch (Exception e) {
			// TODO: handle exception
			System.err.println("Error:The input is not a letter");
		}
	}
	public static boolean isString(String data)
	{
		boolean value=true;
		 for(int i=0;i<data.length();i++)
		 {
			 if(Character.isDigit(data.charAt(i)))
		      {
		    	System.err.println("Error:input is not letter"); 
		    	value=false;
		    	break;
		      }
		 }
		return value;
	}
	
}
