package com.greatlearning.iitr.dsa.labsession2;

import java.util.Scanner;


public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction Array");
				
		int sizeOfArray = s.nextInt();
		
		int arr[] = new int[sizeOfArray];
		
		System.out.println("Enter the values of Array");
		
		for (int i =0; i<sizeOfArray; i++)
		{
			
				arr[i]= s.nextInt();
		}
		
		      System.out.println("Enter the total no of targets that needs to be achieved?");
		
		      int targetNo = s.nextInt();
		 
		 	  	 
		while (targetNo !=0)
		{
			
		
		     System.out.println("Enter the value of target");
			 
			 int target = s.nextInt();
			 
			 int sum=0;
			 
			 int flag =0;
					 
		     for (int i=0; i<sizeOfArray ; i++)
			 
			 {
			  sum += arr[i];
			 
			  if (sum>=target)
			    {
			    	System.out.println("Target achieved after "+(i+1)+ " Transaction");
			        flag = 1;
			        break;
			    }
			  
			 }
		     
			  if (flag==0)
			  {
				  System.out.println("Given target not achieved ");
			  }
			    
		}
		
			 
		 }
	   
}
