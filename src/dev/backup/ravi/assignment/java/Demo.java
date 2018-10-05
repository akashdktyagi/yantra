package dev.backup.ravi.assignment.java;

public class Demo extends ABDemo{
	
	int x;
	int y;
	
	public Demo(int i,int j,int x,int y){
		
		   super(i,j); 
		    this.x=x;
		    this.y=y;
	}
	

	public static void main(String[] args) {
		Demo d = new Demo(10,20,30,40);
		System.out.println(d.i+ " "+ d.j+ " "+ d.x + " "+d.y+ " " );
			
		

	}

}
