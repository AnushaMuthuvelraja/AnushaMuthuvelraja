package Homework.week1;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str= "Welcome to chennai";
		char ch='e';
		char[] charArray=str.toCharArray();
		int count=0;
		
		for (int i=0;i<charArray.length;i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
	
			System.out.println("Character" + " " + ch + " "+ "occurs" +" " +count + " " +"times");	
		}
	

} 