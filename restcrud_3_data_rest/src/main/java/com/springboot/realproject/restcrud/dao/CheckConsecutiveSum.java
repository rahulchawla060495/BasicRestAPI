package com.springboot.realproject.restcrud.dao;

public class CheckConsecutiveSum {

	public static void main(String[] args)
	{
		int N=30;
		int j=0;
		int sum=0;
		
		for(int i=j+1;i<N;)
		{
			if(j>=i)
			{
				break;
			}
						
			if(sum==N)
			{
				print(j+1,i);	
				sum=sum+i;
				i++;
			}
			else if(sum>N)
			{
				sum=sum-j-1;
				j++;
			}
			else if(sum<N)
			{
				
				sum=sum+i;	
				i++;
			}
		
			//System.out.println("SUM & I"+sum+" "+i);
		}
		
		
	}
	public static void print(int j,int i)
	{
		for(int k=j;k<i;k++)
		{
			System.out.print(k+" ");
		}
		System.out.println();
	}
}
