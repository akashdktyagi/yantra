package dev.backup.sachin;

public class Bubblesort 
{
	public static void main(String args[])
	{
		int A[]={20,10,14,5,1,25,18};
		int arrlength=A.length;
		
		for(int i=0;i<=arrlength-1;i++)
		{
			for(int j=0;j<arrlength-1;j++)
			{
				int k=j+1;
				int a= A[j];
				int b= A[k];
				
				if(b<a)
				{
					//int tenp1=a;
					///int temp2=b;
					A[j]=b;
					A[k]=a;
					
					
				}
				
			}
			

			}
			for(int l=0;l<arrlength;l++)
			{
				System.out.println(A[l]+"");
				
			}
		}
		
	}


