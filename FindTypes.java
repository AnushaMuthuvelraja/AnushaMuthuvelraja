package Homework.week1;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter =0,space =0,num =0,specialChar =0;
		
		char[] arr= test.toCharArray();
		for(int i=0;i<arr[i]; i++)
		{
			if(Character.isLetter(arr[i]))
			{
				System.out.print(arr[i]);
			}
			
			
		}
		for(int i=0;i<arr[i]; i++)
		{
			
			if(Character.isDigit(arr[i]))
					{
				
				System.out.println(arr[i]);
					}
		}
		
		for(int i=0;i<arr[i]; i++)
		{
			
			if(Character.isSpaceChar(0))
					{
				
				System.out.println(arr[i]);
					}
		}
		
		System.out.println("letter" + letter);
	}

}
