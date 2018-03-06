package com.stackroute.datamunger;

import java.util.Scanner;

public class integerAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
       Scanner sc=new Scanner(System.in);
       int sum=0,i;
       String data=sc.nextLine();
       String d[]=data.split(" ");              
       for(i=0;i<d.length;i++)
       {
    	  sum=sum+Integer.parseInt(d[i]); 
       }
       System.out.println(sum);
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.err.println("Error:input is not number");
		}
       
		}
	


}
