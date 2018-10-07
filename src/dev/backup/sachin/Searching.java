package dev.backup.sachin;

public class Searching {

	public static void main(String[] args) 
	{
	int a[]={10,20,30,40,50,60,70};
	int high=a.length-1;
	int low=0;
	int mid=(low+high)/2;
	int searchno=50;
	
	while(low<=high)
	{
		if(a[mid]==searchno)
		{
			System.out.println("element found at index:"+mid);
			break;
			
		}
		else if (a[mid]>searchno)
		{
			high=mid-1;
			
		}
		else {
			low=mid+1;
		}
		mid=(low+high)/2;
		
		
	}
	if(low>high)
	{
		System.out.println("ele not found");
	}
	

	}

}
