package com.Array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create array of characters
		char [] Source = { 'H','A','P','P','Y','L','E','A','R','N','I','N','G'};
		char [] destination = new char [7];

		//copying elements from one array to another array
System.arraycopy(Source ,0 ,destination ,1, 5 );
System.out.println(new String(destination));
//deleting element from an array
int flag = 3;
for (int i=0; i<Source.length; i++ )
{
	//delete function
	if(flag==i) {
		for(int j=i+1; i<Source.length-1; j++) {
			Source [i] = Source [j];
			i++;
		}
		System.out.println(Source);
	}		
		}
	}
	
}
				
