package dev.backup.sachin.assignment;

public class sort {

	public static void main(String[] args)
	{
		int num[]={10,5,25,15,2,1,20};
		int lenArr=num.length;
		for (int i=0;i<lenArr-1;i++)
		{
			for(int j=0;j<lenArr-1;j++)
			{
				int k=j+1;
				int a= num[j];
				int b= num[k];
				
				if(b<a)
				{
					num[j]=b;
					num[k]=a;
					
				}
			}
		}
		for(int i=0;i<lenArr;i++)
		{
			System.out.println(num[i]+"");
		}
		
	}
}