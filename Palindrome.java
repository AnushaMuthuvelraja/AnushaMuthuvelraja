package Homework.week1;

public class Palindrome {

	public static void main(String[] args) {
		
		String str="madam";
		String rev ="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			
		    rev=rev+str.charAt(i);
				
					
		}
			
		
		//System.out.println(rev);
	
	
	if (rev.equals(str))
	{
		System.out.println(str + " " + "is" + " " + "Palindrome");
		
	}
	else
	{
		System.out.println(str + " " + "is" + " " +  "Not Palindrome");
	}
}

}


	
	
	
	
	
	
