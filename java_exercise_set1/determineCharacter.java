package com.stackroute.datamunger;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class determineCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Character:");
			String s=br.readLine();
			if(s.charAt(0)>='a' & s.charAt(0)<='z')
			{
				System.out.println("Small Letter");
			}
			else if(s.charAt(0)>='A' & s.charAt(0)<='Z')
			{
				System.out.println("Capital letter");
			}
			else if(s.charAt(0)>='0' & s.charAt(0)<='9')
			{
				System.out.println("Digit");
			}
			else
			{
				System.out.println("Special Character");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

}
