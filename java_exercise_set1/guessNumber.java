package com.stackroute.datamunger;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class guessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int r = new Random().nextInt(50-1);
			int g=0;
			while(r!=g)
			{
			   System.out.println("Guess the number(1-50):");
			   g=Integer.parseInt(br.readLine());
			   if(r>g)
			   {
				   System.out.println("Number guessed is less than original number");
			   }
			   else if(r<g)
			   {
				   System.out.println("Number guessed is more than original number");
			   }
			   else if(r==g)
			   {
				   System.out.println("Number guessed matches the original number");
				   break;
			   }
			}	
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
